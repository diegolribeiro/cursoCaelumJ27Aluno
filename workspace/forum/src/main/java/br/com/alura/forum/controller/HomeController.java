package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		System.out.println("Requisiçaõ feita no /");
		return "Bem Vindo ao Forum da Alura";
	}
}
