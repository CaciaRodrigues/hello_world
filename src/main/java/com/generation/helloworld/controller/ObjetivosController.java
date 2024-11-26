package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		
		return  "<h1 style='color: #91545B'>Objetivos da Semana:</h1>"
				+ "<ul>"
				+ "<li>Estudar Java</li>"
				+ "<li>Praticar Spring Boot</li>"
				+ "<li>Organizar o tempo de estudo</li>"
				+ "<li>Me aprofundar nos conceitos vistos em aula</li>"
				+ "<li>Manter o local de estudo limpo e organizado</li>"
				+ "</ul>";
	}
}
