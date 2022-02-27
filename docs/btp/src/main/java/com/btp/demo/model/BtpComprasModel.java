package com.btp.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//entidad=tabla de datos
@Table(name = "compras")
//nombre nuestra tabla en la base de datos
public class BtpComprasModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	
	@Column(name="usuario_id", nullable=false)
	@ManyToOne
	private BtpUsuariosModel btpUsuariosModel;
	
	@Column(name="pago_total", nullable=false)
	private Float pago_total;
	
	@Column(name="direccion", nullable=false, length = 255)
	private String direccion;
	
	@Column(name="total_productos", nullable=false)
	private Integer total_productos;
	
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	

	public BtpComprasModel() {
	
	}

	
	
	
	
	
	
	
	
}
