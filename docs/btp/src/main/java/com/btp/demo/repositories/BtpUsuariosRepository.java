package com.btp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btp.demo.model.BtpUsuariosModel;

@Repository
public interface BtpUsuariosRepository extends JpaRepository<BtpUsuariosModel, Integer>{

}
