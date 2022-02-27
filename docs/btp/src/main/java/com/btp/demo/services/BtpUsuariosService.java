package com.btp.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.btp.demo.model.BtpUsuariosModel;
import com.btp.demo.repositories.BtpUsuariosRepository;




@Service
public class BtpUsuariosService {
	
	
private final BtpUsuariosRepository btpUsuariosRepository;
	
	
	public BtpUsuariosService(@Autowired BtpUsuariosRepository btpUsuariosRepository) {
		this.btpUsuariosRepository = btpUsuariosRepository;
	}
	
	
	//obtener y mostrar elementos
		public ArrayList<BtpUsuariosModel>obtenerDatos(){
			return (ArrayList<BtpUsuariosModel>) btpUsuariosRepository.findAll();
			
		}
		
		//guardar Datos
			public BtpUsuariosModel guardarDatos(BtpUsuariosModel btpUsuariosModel) {
				return btpUsuariosRepository.save(btpUsuariosModel);
			}
			
			//eliminar Datos
			public boolean eliminarDatos(Integer id) {
				try {
					btpUsuariosRepository.deleteById(id);
					return true;
				}catch(Exception error) {
					return false;
				}
			}
	

}
