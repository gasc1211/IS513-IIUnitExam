package com.gasc1211.examen2.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasc1211.examen2.models.Cliente;
import com.gasc1211.examen2.models.Reserva;
import com.gasc1211.examen2.models.Vehiculo;
import com.gasc1211.examen2.repositories.ClienteRepository;
import com.gasc1211.examen2.repositories.ReservaRepository;
import com.gasc1211.examen2.repositories.VehiculoRepository;
import com.gasc1211.examen2.services.ReservaService;
import com.gasc1211.examen2.services.dto.ReservaDTO;

@Service
public class ReservaServiceImpl implements ReservaService{

  @Autowired
  private ReservaRepository reservaRepository;
  
  @Autowired
  private ClienteRepository clienteRepository;

  @Autowired
  private VehiculoRepository vehiculoRepository;

  @Override
  public String crearReserva(ReservaDTO dto) {
    
    Cliente cliente = this.clienteRepository.findById(dto.getCodigoCliente()).get();
    Vehiculo vehiculo = this.vehiculoRepository.findById(dto.getIdVehiculo()).get();

    if (cliente != null && vehiculo != null) {
      if (vehiculo.isDisponible()) {

        double total = vehiculo.getTipoVehiculo().getPrecioHora() * dto.getDias();

        Reserva reserva = new Reserva();
        reserva.setIdCliente(dto.getCodigoCliente());
        reserva.setIdVehiculo(dto.getIdVehiculo());
        reserva.setDias(dto.getDias());
        reserva.setTotal(total);
        
        Date date = new Date();
        reserva.setFecha(date);

        vehiculo.setDisponible(false);
        
        this.reservaRepository.save(reserva);
        this.vehiculoRepository.save(vehiculo);
        return "Reserva exitosa!";

      }
    }
    return "No se pudo hacer la reserva...";
  }
  
}
