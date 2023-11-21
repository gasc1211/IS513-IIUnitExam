package com.gasc1211.examen2.services;

import java.util.List;

import com.gasc1211.examen2.models.Vehiculo;

public interface VehiculoService {
  
  public Vehiculo crearVehiculo(Vehiculo vehiculo);
  
  public List<Vehiculo> obtenerTodosVehiculos();
  
  public Vehiculo buscarVehiculo(int idVehiculo);
  
}
