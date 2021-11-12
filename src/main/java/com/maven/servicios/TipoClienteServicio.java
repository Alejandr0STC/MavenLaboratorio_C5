package com.maven.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maven.Interfaces.ITipoCliente;
import com.maven.modelo.*;


@Service
@Transactional
public class TipoClienteServicio {

	@Autowired
	private ITipoCliente itipocliente;
	
	
	public String RegistrarTipoCliente(TipoCliente tipocliente) 
	{
		itipocliente.save(tipocliente);
		
		return "tipo de cliente registrado";
	}
	
	public List<TipoCliente> ListadoCliente()
	{
		List<TipoCliente> listar = itipocliente.findAll();
		return listar;
	}
	
}
