package com.unab.Springdatajpasqlserver.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.Springdatajpasqlserver.DAO.PersonaDAO;

@Controller
public class ControllerPersona {
	
	@Autowired
	private PersonaDAO perDAO;
	
	@GetMapping("/")
	public String Inicio() {
		
		var MostrarPersonas = perDAO.findAll();  
		
		for (var iteracion: MostrarPersonas) {
			System.out.println("id = "+iteracion.getId_persona() + "   Nombre = " + iteracion.getNombre()
			+ "   Email = " + iteracion.getEmail() + "   Telefono = " + iteracion.getTelefono());

		}
		
		return "Index";
	}

}
