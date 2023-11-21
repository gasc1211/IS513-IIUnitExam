package com.gasc1211.examen2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasc1211.examen2.models.TipoVehiculo;
import com.gasc1211.examen2.repositories.TipoVehiculoRepository;
import com.gasc1211.examen2.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

  @Autowired
  private TipoVehiculoRepository tipoVehiculoRepository;

  @Override
  public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
    if (tipoVehiculo != null) {
      return this.tipoVehiculoRepository.save(tipoVehiculo);
    }
    return null;
  }
  
}
