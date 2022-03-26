package idat.edu.pe.ec.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "MallaCurricular")
@Entity
public class MallaCurricular implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4753157139191468882L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMalla;
	private Date Año;
	
	@OneToOne
	@JoinColumn(name = "id_Universidad", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_Universidad) references Universidad (id_Universidad)"))	
	private Universidad universidad;
	
	
	@OneToMany(mappedBy = "malla")
	private List<Curso> cursos = new ArrayList<>();
	
	public int getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(int idMalla) {
		this.idMalla = idMalla;
	}
	public Date getAño() {
		return Año;
	}
	public void setAño(Date año) {
		Año = año;
	}
	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	
}
