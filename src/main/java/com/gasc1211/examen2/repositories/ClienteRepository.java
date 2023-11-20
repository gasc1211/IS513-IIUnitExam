package com.gasc1211.examen2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasc1211.examen2.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
  
}
