package com.gasc1211.examen2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasc1211.examen2.models.TipoCliente;
import com.gasc1211.examen2.repositories.TipoClienteRepository;
import com.gasc1211.examen2.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService{

  @Autowired
  private TipoClienteRepository tipoClienteRepository;

  @Override
  public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
    if (tipoCliente != null) {
      return this.tipoClienteRepository.save(tipoCliente);
    }
    return null;
  }
  
}
