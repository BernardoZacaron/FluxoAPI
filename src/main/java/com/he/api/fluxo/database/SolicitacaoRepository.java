package com.he.api.fluxo.database;

import com.he.api.fluxo.model.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
}
