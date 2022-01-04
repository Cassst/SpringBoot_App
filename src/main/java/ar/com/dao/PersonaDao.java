package ar.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.domain.Persona;

public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
