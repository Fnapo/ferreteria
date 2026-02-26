package com.hibernate.ferreteria.dtos.articulo;

public class ArticuloDTO {
  private long idarticulo;
  private String nombrearticulo;
  private Double precio;
  private Integer existencias;

  public ArticuloDTO(long idarticulo, String nombrearticulo, Double precio, Integer existencias) {
    this.idarticulo = idarticulo;
    this.nombrearticulo = nombrearticulo;
    this.precio = precio;
    this.existencias = existencias;
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

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public Integer getExistencias() {
    return existencias;
  }

  public void setExistencias(Integer existencias) {
    this.existencias = existencias;
  }

}
