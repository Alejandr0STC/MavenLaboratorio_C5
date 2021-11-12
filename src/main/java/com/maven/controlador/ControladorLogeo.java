package com.maven.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLogeo 
{
	@RequestMapping
	public String Logueo()
	{
		System.out.println("ingrso al logueo");
		return "logueo";
	}
	@RequestMapping("/validar")
	public String Validar(@RequestParam("usuario")String usu,@RequestParam("password")String pass,Model modelo)
	{
		String archivojsp="";
		if(usu.equals("admin")&&pass.equals("123456"))
		{
			String men="Usuario con perfil de administrador"+usu;
			modelo.addAttribute("mensaje",men);
			archivojsp= "menu";
		}
		else 
		{
			modelo.addAttribute("error","usuario sin acceso");
			archivojsp="logueo";
		}
		return archivojsp;
	}
}
