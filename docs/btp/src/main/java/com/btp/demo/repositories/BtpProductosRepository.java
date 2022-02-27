package com.btp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btp.demo.model.BtpProductosModel;

@Repository
public interface BtpProductosRepository extends JpaRepository<BtpProductosModel, Integer>{

}
