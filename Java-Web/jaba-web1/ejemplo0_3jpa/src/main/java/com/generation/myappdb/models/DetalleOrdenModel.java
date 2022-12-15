package com.generation.myappdb.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DetalleOr")
public class DetalleOrdenModel {
	
	@Id //para  convertir al id como primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//valor que se va auto incrementar
	@Column(unique = true, nullable = false)
	
	private long id;
	private String nombreDetalleOrden;
	
	@OneToOne
	private OrdenModel orden;
	
	@OneToOne(mappedBy = "porden")
	private ProductoModel producto;
	

	public DetalleOrdenModel() {
		
	}

	public DetalleOrdenModel(long id, String nombreDetalleOrden) {
	
		this.id = id;
		this.nombreDetalleOrden = nombreDetalleOrden;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreDetalleOrden() {
		return nombreDetalleOrden;
	}

	public void setNombreDetalleOrden(String nombreDetalleOrden) {
		this.nombreDetalleOrden = nombreDetalleOrden;
	}

	public OrdenModel getOrden() {
		return orden;
	}

	public void setOrden(OrdenModel orden) {
		this.orden = orden;
	}


}
