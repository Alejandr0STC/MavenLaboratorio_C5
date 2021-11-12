package com.maven.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maven.modelo.Ioperaciones;

@Controller
@RequestMapping("/planilla")
public class ControladorInyecDenp 
{
	private Ioperaciones ioperaciones;
	
	public ControladorInyecDenp(Ioperaciones ioperaciones)
	{
		this.ioperaciones = ioperaciones;
	}
	@RequestMapping
	public String muestraPagina()
	{
		return "index20";
	}
	@RequestMapping("/procesarformulario")
	public String procesarformulario(@RequestParam("valorh") int n1,@RequestParam("cantidadh")int n2,Model  model)
	{
		int resultado=ioperaciones.calculos(n1, n2);
		model.addAttribute("n1",n1);
		model.addAttribute("n2",n2);
		model.addAttribute("resultado",resultado);
		return "calculos";
	}
}
