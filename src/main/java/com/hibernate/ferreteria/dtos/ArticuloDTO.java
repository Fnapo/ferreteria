package com.hibernate.ferreteria.dtos;

import com.hibernate.ferreteria.entities.Articulo;

public class ArticuloDTO {
  private long idarticulo;
  private String nombrearticulo;
  private double precio;
  private int existencias;

  public ArticuloDTO(long idarticulo, String nombrearticulo, double precio, int existencias) {
    this.idarticulo = idarticulo;
    this.nombrearticulo = nombrearticulo;
    this.precio = precio;
    this.existencias = existencias;
  }

  public ArticuloDTO(Articulo articulo) {
    this.idarticulo = articulo.getIdarticulo();
    this.nombrearticulo = articulo.getNombrearticulo();
    this.precio = articulo.getPrecio();
    this.existencias = articulo.getExistencias();
  }

  public long getIdarticulo() {
    return idarticulo;
  }

  public String getNombrearticulo() {
    return nombrearticulo;
  }

  public double getPrecio() {
    return precio;
  }

  public int getExistencias() {
    return existencias;
  }

}
