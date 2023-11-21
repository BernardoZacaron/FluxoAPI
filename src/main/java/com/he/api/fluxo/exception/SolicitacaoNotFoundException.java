package com.he.api.fluxo.exception;

public class SolicitacaoNotFoundException extends RuntimeException{
    public SolicitacaoNotFoundException(Long id){
        super("Não foi possível encontrar a solicitação " + id);
    }
}
