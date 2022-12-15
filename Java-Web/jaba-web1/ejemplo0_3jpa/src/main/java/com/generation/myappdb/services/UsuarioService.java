package com.generation.myappdb.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.myappdb.models.UsuarioModel;
import com.generation.myappdb.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository ur;

	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return (ArrayList<UsuarioModel>) ur.findAll(); 
	}
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return ur.save(usuario);
	}
	
	public ArrayList<UsuarioModel> obtenerPrioridad(Integer prioridad) {
		return ur.findByPrioridad(prioridad);
	}
	
	public Optional<UsuarioModel> obtenerId(long id) {
		return ur.findById(id);
	}
	
	
/*	public boolean eliminarId(Long id) {
		if (ur.findById(id).isPresent()) {
			ur.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	} */
	
	/*TRY CATCH para excepciones otra alternativa de solucion para la eliminacion*/
	
	public boolean eliminarId(Long id) {
		try {
			ur.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

}
