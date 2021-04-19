package com.isaiasbueno.projeto_trademap_clone_dio.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.isaiasbueno.projeto_trademap_clone_dio.dto.AcaoFavoritaDTO;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.AcaoFavorita;
import com.isaiasbueno.projeto_trademap_clone_dio.service.IUsuarioService;
@Service
public class AcaoFavoritaConversor extends ConversorBase<AcaoFavorita, AcaoFavoritaDTO> {
    @Autowired
    private IUsuarioService usuarioService;
    @Override
    public AcaoFavoritaDTO converterEntidadeParaDto(AcaoFavorita entidade) {
        return AcaoFavoritaDTO.builder().codigo(entidade.getCodigo()).build();
    }
    @Override
    public AcaoFavorita converterDtoParaEntidade(AcaoFavoritaDTO dto) {
        return AcaoFavorita
                .builder()
                .codigo(dto.getCodigo())
                .usuario(usuarioService.consultarEntidade(dto.getLoginUsuario()))
                .build();
    }
}
