package com.isaiasbueno.projeto_trademap_clone_dio.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isaiasbueno.projeto_trademap_clone_dio.conversor.usuarioConversor;
import com.isaiasbueno.projeto_trademap_clone_dio.dto.UsuarioDTO;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.AcaoFavorita;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.Usuario;
import com.isaiasbueno.projeto_trademap_clone_dio.repository.UsuarioRepository;
import com.isaiasbueno.projeto_trademap_clone_dio.service.IAcaoFavoritaService;
import com.isaiasbueno.projeto_trademap_clone_dio.service.IUsuarioService;
@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private IAcaoFavoritaService acaoFavoritaService;
    @Autowired
    private usuarioConversor usuarioConversor;
    @Override
    public UsuarioDTO consultar(String login) {
        Usuario usuario = consultarEntidade(login);
        if (usuario != null) {
            List<AcaoFavorita> acoes = acaoFavoritaService.listar(usuario);
            return usuarioConversor.converterEntidadeParaDto(usuario, acoes);
        }
        return null;
    }

    @Override
    public Usuario consultarEntidade(String login) {
        return usuarioRepository.findByLogin(login);
    }
}
