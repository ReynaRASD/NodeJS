package com.btp.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btp.demo.model.BtpProductosModel;
import com.btp.demo.services.BtpProductosService;


@RestController
public class BtpProductosController {

	
private final BtpProductosService btpProductosService; 
	
	
	public BtpProductosController(@Autowired BtpProductosService btpProductosService) {
		//Autowired es como decirle a spring, necesito un objeto pero que tu lo hagas
		this.btpProductosService = btpProductosService;
	}
	

	
//mostrar equipos
	@GetMapping("/productos")
	public ArrayList<BtpProductosModel> obtenerDatos(){
	return btpProductosService.obtenerDatos();
	}

//guardar y editar Datos en la tabla
	@PostMapping("/productos")
	public BtpProductosModel guardarDatos(@RequestBody BtpProductosModel btpProductosModel) {
	return btpProductosService.guardarDatos(btpProductosModel);
	}

/*
//eliminar Dato
	@DeleteMapping(path = "/{id}") // localhost:8080/usuarios/1
	public boolean eliminarDatos(@PathVariable("id")Integer id) {
	return btpProductosService.eliminarDatos(id);
	}
	*/
}
