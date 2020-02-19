package com.example.algamoneyapi.service;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.PessoaRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa Atualizar(Long codigo, Pessoa pessoa) {
        final Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
        BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
        return pessoaRepository.save(pessoaSalva);
    }

    public void atualizarPropriedadeAtivo(Long codigo, boolean ativo) {
        Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
        pessoaSalva.setAtivo(ativo);
        pessoaRepository.save(pessoaSalva);
    }

    private Pessoa buscarPessoaPeloCodigo(Long codigo) {
        final Pessoa pessoaSalva = pessoaRepository.getOne(codigo);
        if (pessoaSalva == null) {
            throw new EmptyResultDataAccessException(1);
        }
        return pessoaSalva;
    }

}