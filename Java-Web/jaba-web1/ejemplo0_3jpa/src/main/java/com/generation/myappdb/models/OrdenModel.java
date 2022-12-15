package com.generation.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orden")
public class OrdenModel {
	
	@Id //para  convertir al id como primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//valor que se va auto incrementar
	@Column(unique = true, nullable = false)
	
	private long id;
	private String nombreOrden;
	
	@ManyToOne
	private UsuarioModel usuario;
	
	@OneToOne(mappedBy = "orden")
	private DetalleOrdenModel detalle;

	public OrdenModel() {
		
	}

	public OrdenModel(long id, String nombreOrden) {

		this.id = id;
		this.nombreOrden= nombreOrden;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreOrden() {
		return nombreOrden;
	}

	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}

	
	
	
}
