package idat.edu.pe.ec.model;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Table(name = "Universidad")
@Entity
public class Universidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -324209512142579181L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUniversidad;
	private String Universidad;
	
	@OneToOne(mappedBy = "universidad")
	private MallaCurricular malla;
	
	public int getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(int idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getUniversidad() {
		return Universidad;
	}
	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
	
	
}
