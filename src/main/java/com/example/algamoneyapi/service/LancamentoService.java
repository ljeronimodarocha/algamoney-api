package com.example.algamoneyapi.service;

import javax.validation.Valid;

import com.example.algamoneyapi.model.Lancamento;
import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.LancamentoRepository;
import com.example.algamoneyapi.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.algamoneyapi.service.exception.*;

/**
 * LancamentoService
 */
@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamenteRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Lancamento salvar(@Valid Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).orElse(null);
        if (pessoa == null || pessoa.isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamenteRepository.save(lancamento);
    }

}