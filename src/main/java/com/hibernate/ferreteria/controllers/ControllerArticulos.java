package com.hibernate.ferreteria.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.ferreteria.dtos.ArticuloDTO;
import com.hibernate.ferreteria.entities.Articulo;
import com.hibernate.ferreteria.service.ServiceArticulos;

@RestController
@RequestMapping("/api/articulos")
public class ControllerArticulos {
  private final ServiceArticulos serviceArticulos;

  public ControllerArticulos(ServiceArticulos serviceArticulos) {
    this.serviceArticulos = serviceArticulos;
  }

  @GetMapping("/todos")
  public List<ArticuloDTO> obtenerTodos() {
    List<ArticuloDTO> salida = new ArrayList<>();

    for (Articulo articulo : serviceArticulos.obtenerTodos()) {
      salida.add(new ArticuloDTO(articulo));
    }

    return salida;
  }

  @GetMapping("/id/{id}")
  public ResponseEntity<ArticuloDTO> obtenerPorId(@PathVariable long id) {
    Articulo articulo = serviceArticulos.buscarPorId(id);

    return articulo != null ? ResponseEntity.ok(new ArticuloDTO(articulo)) : ResponseEntity.notFound().build();
  }
}
