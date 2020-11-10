package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Jogador;
import com.example.demo.repository.JogadoresRepository;


@RestController
@RequestMapping("/jogadores")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JogadorController {
	
	@Autowired
	private JogadoresRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Jogador>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Jogador> post (@RequestBody Jogador jogador){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(jogador));
	}
	
	@PutMapping
	public ResponseEntity<Jogador> put (@RequestBody Jogador jogador){
		return ResponseEntity.ok(repository.save(jogador));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
