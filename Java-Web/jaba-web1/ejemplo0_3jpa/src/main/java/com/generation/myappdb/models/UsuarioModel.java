package com.generation.myappdb.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "susarios")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	private String nombre;
	private String email;
	private Integer prioridad;
	
	//MAPEAR LA RELACION USUARIO A PRODUCTOS
	@OneToMany(mappedBy = "usuario")//es un usuario con muchos productos
	//como son muchos la forma de relacion va a cambiar, cardinalidad de la relacion
	private ArrayList<ProductoModel> productos; //tienen que estar en un arreglo porque se va a relacionar con muchos productos
	
//REALCION DE USUARIO A ORDEN
	@OneToMany (mappedBy = "usuario")
	private ArrayList<OrdenModel> ordenes;
	
	
//constructor vacio
	public UsuarioModel(){

	}
//constructor sobrecargado y que definen los parametros
	public UsuarioModel(long id, String nombre, String email, Integer prioridad) {

		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.prioridad = prioridad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

}
