package com.he.api.fluxo.controller;

import com.he.api.fluxo.database.UsuarioRepository;
import com.he.api.fluxo.exception.UsuarioNotFoundException;
import com.he.api.fluxo.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    private final UsuarioRepository rep;

    UsuarioController(UsuarioRepository rep) {
        this.rep = rep;
    }

    @GetMapping("/usuario")
    List<Usuario> buscarTodasSolicitacoes() {
        return rep.findAll();
    }

    @PostMapping("/novaUsuario")
    Usuario addUsuario(@RequestBody Usuario novaUsuario) {
        return rep.save(novaUsuario);
    }

    @GetMapping("/usuario/{id}")
    Usuario buscarUsuario(@PathVariable Long id) {
        return rep.findById(id)
                .orElseThrow(() -> new UsuarioNotFoundException(id));
    }

//    @PutMapping("/usuario/{id}")
//    Usuario modificarUsuario(@RequestBody Usuario novaUsuario, @PathVariable Long id) {
//        return rep.findById(id)
//                .map(Usuario -> {
//                    Usuario.setCpf(novaUsuario.getCpf());
//                    Usuario.setSenha(novaUsuario.getSenha());
//                    return rep.save(Usuario);
//                })
//                .orElseGet(() -> {
//                    novaUsuario.setId(id);
//                    return rep.save(novaUsuario);
//                });
//    }

    @DeleteMapping("/usuario/{id}")
    void excluirUsuario(@PathVariable Long id) {
        rep.deleteById(id);
    }
}
