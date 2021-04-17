package com.isaiasbueno.projeto_trademap_clone_dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isaiasbueno.projeto_trademap_clone_dio.modelo.Usuario;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}
