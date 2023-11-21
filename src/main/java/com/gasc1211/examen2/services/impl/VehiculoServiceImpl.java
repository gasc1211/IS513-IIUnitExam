package com.gasc1211.examen2.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasc1211.examen2.models.Vehiculo;
import com.gasc1211.examen2.repositories.TipoVehiculoRepository;
import com.gasc1211.examen2.repositories.VehiculoRepository;
import com.gasc1211.examen2.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

  @Autowired
  private VehiculoRepository vehiculoRepository;

  @Autowired
  private TipoVehiculoRepository tipoVehiculoRepository;

  @Override
  public Vehiculo crearVehiculo(Vehiculo vehiculo) {
    if (vehiculo != null){
      if (vehiculo.getTipoVehiculo() != null) {
        this.tipoVehiculoRepository.save(vehiculo.getTipoVehiculo());
      }
      return this.vehiculoRepository.save(vehiculo);
    }
    return null;
  }

  @Override
  public List<Vehiculo> obtenerTodosVehiculos() {
    return this.vehiculoRepository.findAll();
  }

  @Override
  public Vehiculo buscarVehiculo(int idVehiculo) {
    Vehiculo vehiculo = this.vehiculoRepository.findById(idVehiculo).get();
    if (vehiculo != null ) return vehiculo;
    return null;
  }
  
}
