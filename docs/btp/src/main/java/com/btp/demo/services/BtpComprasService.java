package com.btp.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btp.demo.model.BtpComprasModel;

import com.btp.demo.repositories.BtpComprasRepository;



@Service
public class BtpComprasService {

private final BtpComprasRepository btpComprasRepository;
	
	
	public BtpComprasService(@Autowired BtpComprasRepository btpComprasRepository) {
		this.btpComprasRepository = btpComprasRepository;
	}
	
	
	//obtener y mostrar elementos
		public ArrayList<BtpComprasModel>obtenerDatos(){
			return (ArrayList<BtpComprasModel>) btpComprasRepository.findAll();
			
		}
		
		//guardar Datos
			public BtpComprasModel guardarDatos(BtpComprasModel btpComprasModel) {
				return btpComprasRepository.save(btpComprasModel);
			}
			
			//eliminar Datos
			public boolean eliminarDatos(Integer id) {
				try {
					btpComprasRepository.deleteById(id);
					return true;
				}catch(Exception error) {
					return false;
				}
			}
	
	
	
	
}
