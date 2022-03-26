package idat.edu.pe.ec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import idat.edu.pe.ec.dto.UniversidadRequestDTO;
import idat.edu.pe.ec.dto.UniversidadResponseDTO;
import idat.edu.pe.ec.model.Universidad;
import idat.edu.pe.ec.repository.UniversidadRepository;

public class UniversidadServiceImpl implements UniversidadSerivice{

	@Autowired
	private UniversidadRepository repository;
	
	@Override
	public void guardarUniversidad(UniversidadRequestDTO u) {
		// TODO Auto-generated method stub
		Universidad uni = new Universidad();
		uni.setIdUniversidad(u.getIdUniRequest());
		uni.setUniversidad(u.getNombreUniversidad());
		repository.save(uni);
		
	}

	@Override
	public void eliminarUniversidad(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public void editarUniversidad(UniversidadRequestDTO u) {
		// TODO Auto-generated method stub
		Universidad uni = new Universidad();
		uni.setIdUniversidad(u.getIdUniRequest());
		uni.setUniversidad(u.getNombreUniversidad());
		repository.saveAndFlush(uni);
		
	}

	@Override
	public List<UniversidadResponseDTO> listarUniversidad() {
		// TODO Auto-generated method stub
		List<Universidad> universidad = repository.findAll();
		
		List<UniversidadResponseDTO> dto = new ArrayList<UniversidadResponseDTO>();
		UniversidadResponseDTO uniDto = null;
		
		
		
		return null;
	}

	@Override
	public UniversidadResponseDTO universidadById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
