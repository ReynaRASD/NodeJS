package com.btp.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btp.demo.model.BtpProductosModel;
import com.btp.demo.repositories.BtpProductosRepository;


@Service
public class BtpProductosService {

	private final BtpProductosRepository btpProductosRepository;
	
	public BtpProductosService(@Autowired BtpProductosRepository btpProductosRepository) {
	
		this.btpProductosRepository = btpProductosRepository;
		
		//Es una instancia de esa interfaz
	}
	
	
	/////////////////////////////////////////////////PRODUCTOS
	public ArrayList<BtpProductosModel>obtenerDatos(){
		return (ArrayList<BtpProductosModel>) btpProductosRepository.findAll();
		
	}
	
	//guardar Datos
		public BtpProductosModel guardarDatos(BtpProductosModel btpProductosModel) {
			return btpProductosRepository.save(btpProductosModel);
		}
		
		//eliminar Datos
		public boolean eliminarDatos(Integer id) {
			try {
				btpProductosRepository.deleteById(id);
				return true;
			}catch(Exception error) {
				return false;
			}
		}
}
