package idat.edu.pe.ec.service;

import java.util.List;

import idat.edu.pe.ec.dto.UniversidadRequestDTO;
import idat.edu.pe.ec.dto.UniversidadResponseDTO;

public interface UniversidadSerivice {

	public void guardarUniversidad(UniversidadRequestDTO u);
	public void eliminarUniversidad(Integer id);
	public void editarUniversidad(UniversidadRequestDTO u);
	public List<UniversidadResponseDTO> listarUniversidad();
	public UniversidadResponseDTO universidadById(Integer id);
	
}
