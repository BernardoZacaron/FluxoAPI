package com.he.api.fluxo.exception;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException(Long id){
        super("Não foi possível encontrar o usuário " + id);
    }
}
