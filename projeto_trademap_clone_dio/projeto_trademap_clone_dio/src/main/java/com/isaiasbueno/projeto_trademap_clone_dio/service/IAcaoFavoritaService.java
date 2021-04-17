package com.isaiasbueno.projeto_trademap_clone_dio.service;

import java.util.List;
import com.isaiasbueno.projeto_trademap_clone_dio.dto.AcaoFavoritaDTO;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.AcaoFavorita;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.Usuario;
public interface IAcaoFavoritaService {
    AcaoFavorita salvar(AcaoFavorita acaoFavorita);
    AcaoFavoritaDTO salvar(AcaoFavoritaDTO acaoFavoritaDTO);
    List<AcaoFavorita> listar(Usuario usuario);
    List<AcaoFavorita> listarSemDuplicidade();
}
