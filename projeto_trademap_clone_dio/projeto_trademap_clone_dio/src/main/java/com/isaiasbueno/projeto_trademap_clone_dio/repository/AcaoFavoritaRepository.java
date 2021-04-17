package com.isaiasbueno.projeto_trademap_clone_dio.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.AcaoFavorita;
import com.isaiasbueno.projeto_trademap_clone_dio..modelo.Usuario;
public interface AcaoFavoritaRepository extends JpaRepository<AcaoFavorita, Long> {
    List<AcaoFavorita> findByUsuario(Usuario usuario);
    AcaoFavorita findByCodigoAndUsuario(String codigo, Usuario usuario);
}
