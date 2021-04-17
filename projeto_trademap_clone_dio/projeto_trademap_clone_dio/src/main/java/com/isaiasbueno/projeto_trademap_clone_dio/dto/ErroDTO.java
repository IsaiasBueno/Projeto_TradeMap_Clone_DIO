package com.isaiasbueno.projeto_trademap_clone_dio.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ErroDTO {
    private String campo;
    private String mensagem;
}
