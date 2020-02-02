package com.example.algamoneyapi.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.algamoneyapi.model.Categoria;
import com.example.algamoneyapi.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaRepository repo;

	@GetMapping
	public List<Categoria> listar() {
		return repo.findAll();
	}

	@PostMapping
	public ResponseEntity<Categoria> criar(@RequestBody Categoria categoria) {
		Categoria categoriaSalva = repo.save(categoria);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{codigo}")
				.buildAndExpand(categoriaSalva.getCodigo()).toUri();
		return ResponseEntity.created(uri).body(categoriaSalva);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<Categoria> buscaPeloCodigo(@PathVariable Long codigo) {
		Categoria c = repo.findById(codigo).orElse(null);
		if (c != null)
			return ResponseEntity.ok().body(c);

		return ResponseEntity.notFound().build();
	}
}
