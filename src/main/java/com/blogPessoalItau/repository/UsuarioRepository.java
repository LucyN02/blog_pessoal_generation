package com.blogPessoalItau.repository;

import com.blogPessoalItau.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //
    //findByUsuario (sao palavras reservadas) -> procure pelo nome do atributo usuario
    public Optional<Usuario> findByUsuario(String usuario);
}