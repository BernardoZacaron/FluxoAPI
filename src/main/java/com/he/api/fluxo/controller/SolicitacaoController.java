package com.he.api.fluxo.controller;

import com.he.api.fluxo.exception.SolicitacaoNotFoundException;
import com.he.api.fluxo.model.Solicitacao;
import com.he.api.fluxo.database.SolicitacaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class SolicitacaoController {
    private final SolicitacaoRepository rep;

    SolicitacaoController(SolicitacaoRepository rep) {
        this.rep = rep;
    }

    @GetMapping("/solicitacao")
    List<Solicitacao> buscarTodasSolicitacoes() {
        return rep.findAll();
    }

    @PostMapping("/novaSolicitacao")
    Solicitacao addSolicitacao(@RequestBody Solicitacao novaSolicitacao) {
        return rep.save(novaSolicitacao);
    }

    @GetMapping("/solicitacao/{id}")
    Solicitacao buscarSolicitacao(@PathVariable Long id) {
        return rep.findById(id)
                .orElseThrow(() -> new SolicitacaoNotFoundException(id));
    }

    @PutMapping("/solicitacao/{id}")
    Solicitacao modificarSolicitacao(@RequestBody Solicitacao novaSolicitacao, @PathVariable Long id) {
        return rep.findById(id)
                .map(solicitacao -> {
                    solicitacao.setDescricao(novaSolicitacao.getDescricao());
                    solicitacao.setStatus(novaSolicitacao.getStatus());
                    return rep.save(solicitacao);
                })
                .orElseGet(() -> {
                    novaSolicitacao.setId(id);
                    return rep.save(novaSolicitacao);
                });
    }

    @DeleteMapping("/solicitacao/{id}")
    void excluirSolicitacao(@PathVariable Long id) {
        rep.deleteById(id);
    }
}