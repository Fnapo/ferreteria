package com.hibernate.ferreteria.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idarticulo;

  private String nombrearticulo;
  private double precio;
  private int existencias;
  private LocalDateTime creado_el;
  private LocalDateTime modificado_el;

  public Articulo(long idarticulo, String nombrearticulo, double precio, int existencias) {
    this.idarticulo = idarticulo;
    this.nombrearticulo = nombrearticulo;
    this.precio = precio;
    this.existencias = existencias;
  }

  public Articulo() {
  }

  public long getIdarticulo() {
    return idarticulo;
  }

  public void setIdarticulo(long idarticulo) {
    this.idarticulo = idarticulo;
  }

  public String getNombrearticulo() {
    return nombrearticulo;
  }

  public void setNombrearticulo(String nombrearticulo) {
    this.nombrearticulo = nombrearticulo;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getExistencias() {
    return existencias;
  }

  public void setExistencias(int existencias) {
    this.existencias = existencias;
  }

  public LocalDateTime getCreado_el() {
    return creado_el;
  }

  public void setCreado_el(LocalDateTime creado_el) {
    this.creado_el = creado_el;
  }

  public void setModificado_el(LocalDateTime modificado_el) {
    this.modificado_el = modificado_el;
  }

  public LocalDateTime getModificado_el() {
    return modificado_el;
  }
}
