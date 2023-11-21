package com.gasc1211.examen2.services;

import java.util.List;

import com.gasc1211.examen2.models.Cliente;

public interface ClienteService {
  
  public Cliente crearCliente(Cliente cliente);
  
  public List<Cliente> obtenerTodosClientes();
  
  public Cliente buscarCliente(int codigoCliente);
  
}
