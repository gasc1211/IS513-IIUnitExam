package com.gasc1211.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasc1211.examen2.models.TipoVehiculo;
import com.gasc1211.examen2.services.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipoVehiculo")
public class TipoVehiculoController {
  
  @Autowired
  private TipoVehiculoServiceImpl tipoVehiculoService;
  
  @PostMapping("/crear")
  public TipoVehiculo creaTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
    return this.tipoVehiculoService.crearTipoVehiculo(tipoVehiculo);
  }
}
