package com.he.api.fluxo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    private @Id @GeneratedValue Long id;
    private String nome, cpf;
    private String role, login, senha;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String cpf, String role, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.role = role;
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String nome, String cpf, String role, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.role = role;
        this.login = login;
        this.senha = senha;
    }

    public Usuario(Long id, String nome, String cpf, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
