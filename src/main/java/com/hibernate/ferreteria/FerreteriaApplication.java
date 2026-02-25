package com.hibernate.ferreteria;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.ferreteria.entities.Articulo;
import com.hibernate.ferreteria.repos.RepoArticulos;

//import com.hibernate.ferreteria.repos.RepoArticulos;

@SpringBootApplication
public class FerreteriaApplication implements CommandLineRunner {

	// CommandLineRunner es una interfaz funcional que se utiliza para ejecutar
	// código después de que la aplicación Spring Boot haya arrancado completamente.
	// Es útil para realizar tareas de inicialización, como cargar datos en la base
	// de datos, configurar servicios o ejecutar cualquier lógica que necesite
	// ejecutarse una vez que la aplicación esté lista. Es opcional implementar esta
	// interfaz en la clase principal de la aplicación o en cualquier otro
	// componente de Spring, y el método run() se ejecutará automáticamente después
	// de que la aplicación haya arrancado.

	@Autowired
	// La anotación @Autowired se utiliza para inyectar automáticamente una
	// instancia
	// de una clase en otra clase. En este caso, se está inyectando una
	// instancia de RepositorioArticulos en la clase FerreteriaApplication. Esto
	// permite que la clase FerreteriaApplication tenga acceso a los métodos y
	// funcionalidades proporcionados por RepositorioArticulos sin necesidad de
	// crear manualmente una instancia de esa clase. Parece obligado su uso pues no
	// existe un constructor para inyectar la dependencia, aunque se podría crear un
	// constructor para inyectar la dependencia sin usar @Autowired, pero es una
	// práctica común en Spring utilizar esta anotación para facilitar la inyección
	// de dependencias.
	private RepoArticulos repositorioArticulos;

	public static void main(String[] args) {
		SpringApplication.run(FerreteriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Bienvenido a la Ferreteria, aplicacion iniciada correctamente.");
		List<Articulo> articulos = repositorioArticulos.findAll();

		if (articulos.isEmpty()) {
			System.out.println("No hay articulos en la base de datos.");
		} else {
			System.out.println("Articulos en la base de datos:");
			articulos.stream().forEach(articulo -> {
				System.out.println("ID: " + articulo.getIdarticulo());
				System.out.println("Nombre: " + articulo.getNombrearticulo());
				System.out.println("Precio: " + articulo.getPrecio());
				System.out.println("Existencias: " + articulo.getExistencias());
				System.out.println("-----------------------------");
			});
		}

	}

}
