package com.isaiasbueno.projeto_trademap_clone_dio.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.isaiasbueno.projeto_trademap_clone_dio.dto.UsuarioDTO;
import com.isaiasbueno.projeto_trademap_clone_dio.service.IUsuarioService;
@RestController
@RequestMapping("/usuarios")
public class UsuarioResource extends ResourceBase<UsuarioDTO> {
    @Autowired
    private IUsuarioService usuarioService;
    @GetMapping("/{login}")
    public ResponseEntity<UsuarioDTO> consultar(@PathVariable String login) {
        UsuarioDTO usuario = usuarioService.consultar(login);
        if (usuario == null) {
            return responderItemNaoEncontrado();
        }
        return responderSucessoComItem(usuario);
    }
}
