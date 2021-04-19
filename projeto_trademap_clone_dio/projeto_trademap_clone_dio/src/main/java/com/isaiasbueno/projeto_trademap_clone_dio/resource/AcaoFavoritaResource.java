package com.isaiasbueno.projeto_trademap_clone_dio.resource;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.isaiasbueno.projeto_trademap_clone_dio.dto.AcaoFavoritaDTO;
import com.isaiasbueno.projeto_trademap_clone_dio.service.IAcaoFavoritaService;
@RestController
@RequestMapping("/acoes")
public class AcaoFavoritaResource extends ResourceBase<AcaoFavoritaDTO> {
    @Autowired
    private IAcaoFavoritaService acaoFavoritaService;
    @PostMapping("/favorita")
    public ResponseEntity<AcaoFavoritaDTO> salvar(@RequestBody @Valid AcaoFavoritaDTO acaoFavoritaDTO) {
        AcaoFavoritaDTO acaoFavoritaRetorno = acaoFavoritaService.salvar(acaoFavoritaDTO);
        return responderSucessoComItem(acaoFavoritaRetorno);
    }
}
