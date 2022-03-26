package idat.edu.pe.ec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.ec.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad,Integer>{
	
	

}
