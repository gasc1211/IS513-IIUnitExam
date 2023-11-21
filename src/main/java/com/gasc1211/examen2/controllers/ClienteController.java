package com.gasc1211.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasc1211.examen2.models.Cliente;
import com.gasc1211.examen2.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

  @Autowired
  private ClienteServiceImpl clienteService;

  @PostMapping("/crear")
  public Cliente crearCliente(@RequestBody Cliente cliente) {
    return this.clienteService.crearCliente(cliente);
  }
}
