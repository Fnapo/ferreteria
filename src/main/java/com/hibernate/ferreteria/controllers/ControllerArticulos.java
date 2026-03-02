package com.hibernate.ferreteria.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.ferreteria.dtos.articulo.ArticuloDTO;
import com.hibernate.ferreteria.dtos.articulo.CrearArticuloDTO;
import com.hibernate.ferreteria.services.ServiceArticulos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/articulos")
public class ControllerArticulos {
  private final ServiceArticulos serviceArticulos;

  public ControllerArticulos(ServiceArticulos serviceArticulos) {
    this.serviceArticulos = serviceArticulos;
  }

  @GetMapping("/todos")
  public List<ArticuloDTO> obtenerTodos() {
    return serviceArticulos.obtenerTodos();
  }

  @GetMapping("/id/{id}")
  public ResponseEntity<ArticuloDTO> obtenerPorId(@PathVariable long id) {
    ArticuloDTO articulo = serviceArticulos.buscarPorId(id);

    return articulo != null ? ResponseEntity.ok(articulo) : ResponseEntity.notFound().build();
  }

  @PostMapping("/insertar")
  public ArticuloDTO insertar(@RequestBody CrearArticuloDTO articuloDTO) {
    return serviceArticulos.insertar(articuloDTO);
  }

  @PatchMapping("modificar/{id}")
  public ResponseEntity<ArticuloDTO> modificar(@PathVariable long id,
      @RequestBody ArticuloDTO articuloDTO) {
    if (id != articuloDTO.getIdarticulo())
      return ResponseEntity.badRequest().build();

    ArticuloDTO articulo = serviceArticulos.modificar(id, articuloDTO);

    return articulo != null ? ResponseEntity.ok(articulo) : ResponseEntity.notFound().build();
  }

  @DeleteMapping("/borrar/{id}")
  public ResponseEntity<ArticuloDTO> borrar(@PathVariable long id) {
    boolean borrado = serviceArticulos.borrar(id);

    return borrado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
  }
}
