package com.unab.Springdatajpasqlserver.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.Springdatajpasqlserver.DAO.PersonaDAO;
import com.unab.Springdatajpasqlserver.Entidades.Persona;

@Controller
public class ControllerPersona {
	
	@Autowired
	private PersonaDAO perDAO;
	
	@GetMapping("/")
	public String Inicio(Model M) {
		
		var MostrarPersonas = perDAO.findAll();  
		
		M.addAttribute("persona",MostrarPersonas );
		
		return "Index";
	}
	
	@GetMapping("/agregar")
	public String Agregar(Persona Persona) {
		return "agregar";
	}

}
