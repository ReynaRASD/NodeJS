package com.btp.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.btp.demo.model.BtpUsuariosModel;
import com.btp.demo.services.BtpUsuariosService;


@RestController
public class BtpUsuariosController {

	
private final BtpUsuariosService btpUsuariosService; 
	
	
	public BtpUsuariosController(@Autowired BtpUsuariosService btpUsuariosService) {
		//Autowired es como decirle a spring, necesito un objeto pero que tu lo hagas
		this.btpUsuariosService = btpUsuariosService;
	}
	
	//mostrar usuarios
		@GetMapping("/usuarios")
		public ArrayList<BtpUsuariosModel> obtenerDatos(){
			return btpUsuariosService.obtenerDatos();
		}
		
		@PostMapping("/usuarios")
		public BtpUsuariosModel guardarDatos(@RequestBody BtpUsuariosModel btpUsuariosModel) {
			return btpUsuariosService.guardarDatos(btpUsuariosModel);
		}
		
		
		//eliminar Dato
		@DeleteMapping("/{id}") // localhost:8080/usuarios/1
		public boolean eliminarDatos(@PathVariable("id")Integer id) {
			return btpUsuariosService.eliminarDatos(id);
		}
		
	
}
