package com.example.algamoneyapi.repository;

import com.example.algamoneyapi.model.Lancamento;
import com.example.algamoneyapi.repository.lancamento.LancamenteResositoryQuery;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamenteResositoryQuery {

}