package com.maven.modelo;

import javax.persistence.*;

@Entity
@Table(name="tipocliente")
public class TipoCliente 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtipocliente")
	private int idtipocliente;
	
	@Column(name="descripcion")
	private String descripcion;
	
	
	
	public TipoCliente() {}
	
	public TipoCliente(int idtipocliente, String descripcion) {
		this.idtipocliente = idtipocliente;
		this.descripcion = descripcion;
	}

	public TipoCliente(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getIdtipocliente() {
		return idtipocliente;
	}

	public void setIdtipocliente(int idtipocliente) {
		this.idtipocliente = idtipocliente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
