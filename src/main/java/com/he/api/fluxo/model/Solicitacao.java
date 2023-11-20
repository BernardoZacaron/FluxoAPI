package com.he.api.fluxo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Solicitacao {
    private @Id @GeneratedValue Long id;
    private int status; //1=aprovado, 0=pendente, -1=declinado
    private String data, descricao, justificativa, solicitante, natureza, centro, custo;

    public Solicitacao() {}

    public Solicitacao(Long id, int status, String data, String descricao, String justificativa, String solicitante, String natureza, String centro, String custo) {
        this.id = id;
        this.status = status;
        this.data = data;
        this.descricao = descricao;
        this.justificativa = justificativa;
        this.solicitante = solicitante;
        this.natureza = natureza;
        this.centro = centro;
        this.custo = custo;
    }

    public Solicitacao(int status, String data, String descricao, String justificativa, String solicitante, String natureza, String centro, String custo) {
        this.status = status;
        this.data = data;
        this.descricao = descricao;
        this.justificativa = justificativa;
        this.solicitante = solicitante;
        this.natureza = natureza;
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

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }
}
