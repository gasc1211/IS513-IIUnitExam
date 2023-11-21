package com.gasc1211.examen2.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasc1211.examen2.models.Cliente;
import com.gasc1211.examen2.repositories.ClienteRepository;
import com.gasc1211.examen2.repositories.TipoClienteRepository;
import com.gasc1211.examen2.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

  @Autowired
  private ClienteRepository clienteRepository;

  @Autowired
  private TipoClienteRepository TipoClienteRepository;

  @Override
  public Cliente crearCliente(Cliente cliente) {
    if (cliente != null){
      if (cliente.getTipoCliente() != null) {
        this.TipoClienteRepository.save(cliente.getTipoCliente());
      }
      return this.clienteRepository.save(cliente);
    }
    return null;
  }

  @Override
  public List<Cliente> obtenerTodosClientes() {
    return this.clienteRepository.findAll();
  }

  @Override
  public Cliente buscarCliente(int codigoCliente) {
    Cliente cliente = this.clienteRepository.findById(codigoCliente).get();
    if (cliente != null) return cliente;
    return null;
  }
}
