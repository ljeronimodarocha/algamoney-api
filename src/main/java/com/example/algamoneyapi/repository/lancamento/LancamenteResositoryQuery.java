package com.example.algamoneyapi.repository.lancamento;

import java.util.List;

import com.example.algamoneyapi.model.Lancamento;
import com.example.algamoneyapi.repository.filter.LancamentoFilter;

/**
 * LancamenteResositoryQuery
 */
public interface LancamenteResositoryQuery{

    public List<Lancamento> filtrar (LancamentoFilter lancamentoFilter);

    
}