package idat.edu.pe.ec.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name = "Curso")
public class Curso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -451289931836076976L;
	private int idCurso;
	private String curso;
	private String descripcion;
	
	
	@ManyToMany(mappedBy = "Curso", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Profesor> profesores = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "id_malla", nullable = false, unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_malla) references MallaCurricular (id_Malla)"))		
	private MallaCurricular malla;

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

	public MallaCurricular getMalla() {
		return malla;
	}

	public void setMalla(MallaCurricular malla) {
		this.malla = malla;
	}
	
	
}