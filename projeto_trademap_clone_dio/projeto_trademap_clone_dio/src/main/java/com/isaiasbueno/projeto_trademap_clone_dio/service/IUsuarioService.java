package com.isaiasbueno.projeto_trademap_clone_dio.service;

import com.isaiasbueno.projeto_trademap_clone_dio.dto.UsuarioDTO;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.Usuario;
public interface IUsuarioService {
    UsuarioDTO consultar(String login);

    Usuario consultarEntidade(String login);
}
