package com.unab.Springdatajpasqlserver.DAO;

import org.springframework.data.repository.CrudRepository;

import com.unab.Springdatajpasqlserver.Entidades.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

}
