package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Jogador;


@Repository
public interface JogadoresRepository extends JpaRepository<Jogador, Long>{

}
