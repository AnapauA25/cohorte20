package com.generation.myappdb.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Producto")
public class ProductoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;
	
	//RELACION DE PRODUCTOS A USUARIO
		@ManyToOne		//muchos productos a un usuario
		private UsuarioModel usuario;		//la relacion de donde la voy a tomar
	
//relacion productos A detalle orde
		@OneToMany (mappedBy = "producto")
		private ArrayList<DetalleOrdenModel> porden;
		
		
	//RELACION DE PRODUCTOS A ORDEN		
//relacion de productos a usuario		
	public ProductoModel() {
		
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public ProductoModel(Long id, String nombreProducto) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
	
}

