package com.gasc1211.examen2.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
  
  @Id
  @Column(name = "codigocliente")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int codigoCliente;

  private String nombre;

  private String apellido;

  @Column(name = "fechaingreso")
  private Date fechaIngreso;

  @ManyToOne
  @JoinColumn(name = "idtipocliente", referencedColumnName = "idtipocliente")
  private TipoCliente tipoCliente;

}
