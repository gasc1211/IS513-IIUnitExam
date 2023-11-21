package com.gasc1211.examen2.services;

import com.gasc1211.examen2.models.Reserva;
import com.gasc1211.examen2.services.dto.ReservaDTO;

public interface ReservaService {
  public Reserva crearReserva(ReservaDTO dto);
}
