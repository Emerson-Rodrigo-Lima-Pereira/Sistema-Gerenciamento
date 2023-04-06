package com.example.sistemaparagerenciamento.dao.peca;

import com.example.sistemaparagerenciamento.model.Peca;

public interface PecaDAO {

    public Peca criar(Peca peca);

    public void atualizar(Peca peca);

    public void deletar(Peca peca);

    public Peca buscarPorNome(String nome);
}
