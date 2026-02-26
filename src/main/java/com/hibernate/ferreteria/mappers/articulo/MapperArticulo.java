package com.hibernate.ferreteria.mappers.articulo;

import java.time.LocalDateTime;

import com.hibernate.ferreteria.dtos.articulo.ArticuloDTO;
import com.hibernate.ferreteria.dtos.articulo.CrearArticuloDTO;
import com.hibernate.ferreteria.entities.Articulo;

public class MapperArticulo {
  public static ArticuloDTO toDTO(Articulo articulo) {
    return new ArticuloDTO(
        articulo.getIdarticulo(),
        articulo.getNombrearticulo(),
        articulo.getPrecio(),
        articulo.getExistencias());
  }

  public static Articulo toEntidadModificada(ArticuloDTO articuloDTO, Articulo modificado) {
    if (articuloDTO.getNombrearticulo() != null) {
      modificado.setNombrearticulo(articuloDTO.getNombrearticulo());
    }
    if (articuloDTO.getPrecio() != null && articuloDTO.getPrecio() > 0) {
      modificado.setPrecio(articuloDTO.getPrecio());
    }
    if (articuloDTO.getExistencias() != null && articuloDTO.getExistencias() > 0) {
      modificado.setExistencias(articuloDTO.getExistencias());
    }
    modificado.setModificado_el(LocalDateTime.now());

    return modificado;
  }

  public static Articulo toEntidadNueva(CrearArticuloDTO articuloDTO) {
    Articulo nuevo = new Articulo(
        0,
        articuloDTO.getNombrearticulo(),
        articuloDTO.getPrecio(),
        articuloDTO.getExistencias());

    nuevo.setCreado_el(LocalDateTime.now());
    nuevo.setModificado_el(LocalDateTime.now());

    return nuevo;
  }
}
