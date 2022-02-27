package com.btp.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btp.demo.model.BtpComprasModel;
import com.btp.demo.services.BtpComprasService;



@RestController
public class BtpComprasController {

	
private final BtpComprasService btpComprasService; 
	
	
	public BtpComprasController(@Autowired BtpComprasService btpComprasService) {
		//Autowired es como decirle a spring, necesito un objeto pero que tu lo hagas
		this.btpComprasService = btpComprasService;
	}
	
	////////////////////////////////////////////////USUARIOS
	
	//mostrar usuarios
	@GetMapping("/compras")
	public ArrayList<BtpComprasModel> obtenerDatos(){
		return btpComprasService.obtenerDatos();
	}
	
	//guardar y editar Datos en la tabla
		@PostMapping("/compras")
		public BtpComprasModel guardarDatos(@RequestBody BtpComprasModel btpComprasModel) {
			return btpComprasService.guardarDatos(btpComprasModel);
		}
		
		/*
	//eliminar Dato
		@DeleteMapping("/{id}")
		public boolean eliminarDatos(@PathVariable("id")Integer id) {
			return btpComprasService.eliminarDatos(id);
		}
	*/
	
}
