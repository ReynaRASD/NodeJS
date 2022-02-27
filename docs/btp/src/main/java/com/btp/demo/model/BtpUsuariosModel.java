package com.btp.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//entidad=tabla de datos
@Table(name = "usuarios")
//nombre nuestra tabla en la base de datos

public class BtpUsuariosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	
	@Column(name="nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name="correo", nullable = false, length = 100)
	private String correo;

	@Column(name="contrasenia", nullable = false, length = 100)
	private String contrasenia;
	
	@Column(name="telefono", nullable = false, length = 45)
	private String telefono;
	

	public BtpUsuariosModel() {
	
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
}
