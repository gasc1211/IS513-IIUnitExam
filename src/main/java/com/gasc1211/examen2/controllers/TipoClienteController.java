package com.gasc1211.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasc1211.examen2.models.TipoCliente;
import com.gasc1211.examen2.services.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipoCliente")
public class TipoClienteController {
  
  @Autowired
  private TipoClienteServiceImpl tipoClienteService;

  @PostMapping("/crear")
  public TipoCliente crearTipoCliente(@RequestBody TipoCliente tipoCliente) {
    return this.tipoClienteService.crearTipoCliente(tipoCliente);
  }
}
