package com.maven.modelo;

public class TipoCliente 
{
	private int idtipoempleado;
	private String descripcion;
	
	
	
	public TipoCliente() {}
	
	public TipoCliente(int idtipoempleado, String descripcion) {
		this.idtipoempleado = idtipoempleado;
		this.descripcion = descripcion;
	}
	
	public int getIdtipoempleado() {
		return idtipoempleado;
	}
	public void setIdtipoempleado(int idtipoempleado) {
		this.idtipoempleado = idtipoempleado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
