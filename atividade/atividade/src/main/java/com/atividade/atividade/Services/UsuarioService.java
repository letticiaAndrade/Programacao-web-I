package com.atividade.atividade.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atividade.atividade.Models.Usuario;
import com.atividade.atividade.Repository.UsuarioRepository;
import java.util.Optional;

import jakarta.transaction.Transactional;

import java.time.LocalDateTime;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario cadastro(String nome, String login, String senha) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setSenha(senha);
        LocalDateTime dataCriacao = LocalDateTime.now();
        usuario.setCadastro(dataCriacao);

        return usuarioRepository.save(usuario);
    }

    public Usuario login(String login, String senha) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByLogin(login);

        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();

            if (usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    };

    public Usuario buscarUsuario(String nome) {
        return usuarioRepository.findByName(nome);
    }

}
