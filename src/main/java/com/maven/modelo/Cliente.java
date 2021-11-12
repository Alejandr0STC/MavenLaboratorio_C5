package com.maven.modelo;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcliente")
	private int idcliente;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="email")
	private String email;
	
	@Column(name="credito")
	private double credito;
	
	@Column(name="telefono")
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="idtipocliente")
	private TipoCliente tipocliente;
	
	public Cliente() {}
	
	public Cliente(int idcliente, String nombre, String apellido, String sexo, String email, double credito,
			String telefono, TipoCliente tipocliente) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.email = email;
		this.credito = credito;
		this.telefono = telefono;
		this.tipocliente = tipocliente;
	}

	public Cliente(int idcliente, String nombre, String apellido, String sexo, String email, double credito,
			String telefono) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.email = email;
		this.credito = credito;
		this.telefono = telefono;
	}
	
	
	
	
	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
