package com.gasc1211.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasc1211.examen2.services.dto.ReservaDTO;
import com.gasc1211.examen2.services.impl.ReservaServiceImpl;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
  
  @Autowired
  private ReservaServiceImpl reservaService;

  @PostMapping("/nueva")
  public String crearReserva(@RequestBody ReservaDTO dto){
    return this.reservaService.crearReserva(dto);
  }
}
