package com.maven.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.modelo.Cliente;

public interface ICliente extends JpaRepository<Cliente, Integer> {

}
