package com.hibernate.ferreteria.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hibernate.ferreteria.dtos.articulo.ArticuloDTO;
import com.hibernate.ferreteria.dtos.articulo.CrearArticuloDTO;
import com.hibernate.ferreteria.entities.Articulo;
import com.hibernate.ferreteria.mappers.articulo.MapperArticulo;
import com.hibernate.ferreteria.repos.RepoArticulos;

@Service
public class ServiceArticulos {
  private final RepoArticulos repositorioArticulos;

  public ServiceArticulos(RepoArticulos repositorioArticulos) {
    this.repositorioArticulos = repositorioArticulos;
  }

  public List<ArticuloDTO> obtenerTodos() {
    return repositorioArticulos.findAll().stream().map(MapperArticulo::toDTO).toList();
  }

  public ArticuloDTO buscarPorId(long id) {
    return repositorioArticulos.findById(id).map(MapperArticulo::toDTO).orElse(null);
  }

  public ArticuloDTO insertar(CrearArticuloDTO articuloDTO) {
    Articulo articulo = MapperArticulo.toEntidadNueva(articuloDTO);
    Articulo insertado = repositorioArticulos.save(articulo);

    return MapperArticulo.toDTO(insertado);
  }

  public ArticuloDTO modificar(long id, ArticuloDTO articuloDTO) {
    Articulo modificado = repositorioArticulos.findById(id).orElse(null);

    if (modificado == null)
      return null;
    MapperArticulo.toEntidadModificada(articuloDTO, modificado);
    modificado = repositorioArticulos.save(modificado);

    return MapperArticulo.toDTO(modificado);
  }

  public boolean borrar(long id) {
    if (repositorioArticulos.existsById(id)) {
      repositorioArticulos.deleteById(id);

      return true;
    }

    return false;
  }
}
