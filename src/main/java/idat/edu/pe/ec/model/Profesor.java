package idat.edu.pe.ec.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "Profesor")
@Entity
public class Profesor implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9030598540260915790L;
	
	private int idProfesor;
	private String profesor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "Detalle_Prof_Curso",
	joinColumns = @JoinColumn(name = "idProfesor", nullable = false,unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (idProfesor) references Profesor (idProfesor)")),
	inverseJoinColumns = @JoinColumn(name = "idCurso", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (idCurso) references Curso (idCurso)" )))
	private List<Curso> cursos = new ArrayList<>();
	
	
	public int getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	
}
