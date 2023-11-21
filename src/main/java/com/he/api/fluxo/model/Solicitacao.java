package com.he.api.fluxo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Solicitacao {
    private @Id @GeneratedValue Long id;
    private int status; //1=aprovado, 0=pendente, -1=declinado
    private String data, descricao, justificativa, nomeSolicitante, centro, custo;
    private Long idSolicitante;

    public Solicitacao() {}

    public Solicitacao(Long id, int status, String data, String descricao, String justificativa, String nomeSolicitante, String centro, String custo, Long idSolicitante) {
        this.id = id;
        this.status = status;
        this.data = data;
        this.descricao = descricao;
        this.justificativa = justificativa;
        this.nomeSolicitante = nomeSolicitante;
        this.centro = centro;
        this.custo = custo;
        this.idSolicitante = idSolicitante;
    }

    public Solicitacao(int status, String data, String descricao, String justificativa, String nomeSolicitante, String centro, String custo, Long idSolicitante) {
        this.status = status;
        this.data = data;
        this.descricao = descricao;
        this.justificativa = justificativa;
        this.nomeSolicitante = nomeSolicitante;
        this.centro = centro;
        this.custo = custo;
        this.idSolicitante = idSolicitante;
    }

    public Solicitacao(String descricao, String solicitante, String centro, String custo) {
        this.status = 0;
        this.data = new Date().toString();
        this.descricao = descricao;
        this.justificativa = "";
        this.nomeSolicitante = solicitante;
        this.centro = centro;
        this.custo = custo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public Long getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Long idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
}
