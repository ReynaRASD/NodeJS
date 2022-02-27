package com.btp.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btp.demo.model.BtpComprasModel;


@Repository
public interface BtpComprasRepository extends JpaRepository<BtpComprasModel, Integer>{

}
