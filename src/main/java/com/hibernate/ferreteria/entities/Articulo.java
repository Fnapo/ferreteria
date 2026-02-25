package com.hibernate.ferreteria.entities;

import java.sql.Date;

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
  private Date creado_el;
  private Date modificado_el;

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

  public Date getCreado_el() {
    return creado_el;
  }

  public Date getModificado_el() {
    return modificado_el;
  }
}
