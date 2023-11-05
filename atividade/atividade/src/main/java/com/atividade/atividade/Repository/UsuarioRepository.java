package com.atividade.atividade.Repository;

import java.util.Optional;
import com.atividade.atividade.Models.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByLogin(String login);

    @Query(" SELECT user FROM Usuario user WHERE user.nome = ?1 ")
     Usuario findByName(String nome);

    
}