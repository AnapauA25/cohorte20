package com.generation.myappdb.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.myappdb.models.UsuarioModel;
import com.generation.myappdb.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService us;

	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return us.obtenerUsuarios();
	}

	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.us.guardarUsuario(usuario);
	}

	@GetMapping("/query")
	public ArrayList<UsuarioModel> ObtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
		return this.us.obtenerPrioridad(prioridad);
	}

	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> obtenerUsuarioporId(@PathVariable("id") Long id) {
		return this.us.obtenerId(id);
	}

@DeleteMapping("/{id}")
	
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean check = this.us.eliminarId(id);
		if (check) {
			return "Se elimino el usuario" + id;
		} else {
			return "No se elimino el usuario" + id;
		}
	}
}
