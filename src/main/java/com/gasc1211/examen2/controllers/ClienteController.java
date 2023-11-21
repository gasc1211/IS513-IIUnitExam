package com.gasc1211.examen2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/todos")
  public List<Cliente> obtenerTodosClientes() {
    return this.clienteService.obtenerTodosClientes();
  }

  @GetMapping("/buscar/{codigoCliente}")
  public Cliente buscarCliente(@PathVariable(name = "codigoCliente") int codigoCliente) {
    return this.clienteService.buscarCliente(codigoCliente);
  }
}
