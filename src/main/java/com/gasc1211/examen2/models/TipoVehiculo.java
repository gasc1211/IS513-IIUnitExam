package com.gasc1211.examen2.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoVehiculo {
  
  @Id
  @Column(name = "idtipovehiculo")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idTipoVehiculo;

  private String descripcion;

  @Column(name = "precioxhora")
  private float precioHora;

  @OneToMany(mappedBy = "tipoVehiculo", cascade = CascadeType.ALL)
  private List<Vehiculo> vehiculos = new ArrayList<>(); 

}
