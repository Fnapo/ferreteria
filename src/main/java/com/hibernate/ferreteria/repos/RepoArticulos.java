package com.hibernate.ferreteria.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hibernate.ferreteria.entities.Articulo;
//import com.hibernate.genericos.repos.RepositorioGenerico;

@Repository
public interface RepoArticulos extends JpaRepository<Articulo, Long> {

  /*
   * @Override
   * public Articulo buscarPorId(long id) {
   * return null;
   * }
   * 
   * @Override
   * public Articulo guardar(Articulo entidad) {
   * return entidad;
   * 
   * }
   * 
   * @Override
   * public Articulo eliminar(long id) {
   * return null;
   * }
   * 
   * @Override
   * public java.util.List<Articulo> obtenerTodos() {
   * return null;
   * }
   * 
   * @Override
   * public Articulo actualizar(Articulo entidad) {
   * return entidad;
   * }
   */

}
