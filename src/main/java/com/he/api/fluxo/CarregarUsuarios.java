package com.he.api.fluxo;

import com.he.api.fluxo.database.SolicitacaoRepository;
import com.he.api.fluxo.database.UsuarioRepository;
import com.he.api.fluxo.model.Solicitacao;
import com.he.api.fluxo.model.Usuario;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class CarregarUsuarios {
    private static final Logger log = (Logger) LoggerFactory.getLogger(CarregarUsuarios.class);

    @Bean
    CommandLineRunner inserirSolicitacoesTeste(SolicitacaoRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Solicitacao("200kg de areia", "Junior da Silva", "277", "R$800,00")));
            log.info("Preloading " + repository.save(new Solicitacao("Pá de alumínio", "Bruno Almeida", "279", "R$80,00")));
        };
    }

    @Bean
    CommandLineRunner inserirUsuariosTeste(UsuarioRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Usuario("Lessandro Hebert", "12345654399", "supervisor", "lessandro", "4399")));
            log.info("Preloading " + repository.save(new Usuario("Bruno Almeida", "85214798320", "comprador", "bruno", "8320")));
        };
    }
}