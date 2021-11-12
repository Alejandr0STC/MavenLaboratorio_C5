package com.maven.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.modelo.TipoCliente;

public interface ITipoCliente extends JpaRepository<TipoCliente,Integer>
{
		
}
