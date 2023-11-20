package com.gasc1211.examen2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasc1211.examen2.models.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
  
}
