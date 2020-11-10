package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Jogos;
import java.util.List;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long>{
	public List<Jogos> findAllByNomeContainingIgnoreCase (String nome);
}
