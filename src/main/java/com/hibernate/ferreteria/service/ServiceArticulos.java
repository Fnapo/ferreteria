package com.hibernate.ferreteria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hibernate.ferreteria.entities.Articulo;
import com.hibernate.ferreteria.repos.RepoArticulos;

@Service
public class ServiceArticulos {
  private final RepoArticulos repositorioArticulos;

  public ServiceArticulos(RepoArticulos repositorioArticulos) {
    this.repositorioArticulos = repositorioArticulos;
  }

  public List<Articulo> obtenerTodos() {
    return repositorioArticulos.findAll();
  }

  public Articulo buscarPorId(long id) {
    return repositorioArticulos.findById(id).orElse(null);
  }
}
