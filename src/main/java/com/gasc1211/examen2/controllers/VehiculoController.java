package com.gasc1211.examen2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasc1211.examen2.models.Vehiculo;
import com.gasc1211.examen2.services.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {
  
  @Autowired
  private VehiculoServiceImpl vehiculoService;

  @PostMapping("/crear")
  public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
    return this.vehiculoService.crearVehiculo(vehiculo);
  }

  @GetMapping("/todos")
  public List<Vehiculo> obtenerTodosVehiculos() {
    return this.vehiculoService.obtenerTodosVehiculos();
  }
  
  @GetMapping("/buscar/{idVehiculo}")
  public Vehiculo buscarCliente(@PathVariable(name = "idVehiculo") int idVehiculo) {
    return this.vehiculoService.buscarVehiculo(idVehiculo);
  }
}
