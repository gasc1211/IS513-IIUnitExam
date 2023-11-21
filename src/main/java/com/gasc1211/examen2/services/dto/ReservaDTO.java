package com.gasc1211.examen2.services.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {
  private int codigoCliente;
  private int idVehiculo;
  private int dias;
}
