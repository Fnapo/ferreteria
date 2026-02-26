package com.hibernate.ferreteria.dtos.articulo;

public class CrearArticuloDTO {
  private String nombrearticulo;
  private double precio;
  private int existencias;

  public CrearArticuloDTO() {
  }

  public CrearArticuloDTO(String nombrearticulo, double precio, int existencias) {
    this.nombrearticulo = nombrearticulo;
    this.precio = precio;
    this.existencias = existencias;
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
}
