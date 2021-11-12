package com.maven.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maven.modelo.TipoCliente;
import com.maven.servicios.TipoClienteServicio;

@Controller
@RequestMapping("conttipocliente")
public class ControladorTipoCliente 
{
	@Autowired
	private TipoClienteServicio tcs;
	
	@RequestMapping("/registrarTipoCliente")
	public String MostrarFormulario(@ModelAttribute("tpcliente") TipoCliente tpcliente, Model model) 
	{
		String mensaje="";
		
		if(tpcliente.getDescripcion()!=null)
		{
			mensaje = tcs.RegistrarTipoCliente(tpcliente);
			model.addAttribute("mensaje",mensaje);
			tpcliente.setDescripcion("");
		}
		
		List<TipoCliente> listadoCliente=tcs.ListadoCliente();
		
		model.addAttribute("listadoCli",listadoCliente);
		return "FormTipoCliente";
	}
}
