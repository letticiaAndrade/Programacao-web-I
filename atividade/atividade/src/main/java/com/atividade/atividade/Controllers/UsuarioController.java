package com.atividade.atividade.Controllers;

import org.springframework.http.HttpStatus;
import com.atividade.atividade.Models.Usuario;
import org.springframework.http.ResponseEntity;
import com.atividade.atividade.Records.UsuarioRequest;
import com.atividade.atividade.Services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody UsuarioRequest usuarioRequest) {
        Usuario usuario = usuarioService.login(
                usuarioRequest.login(),
                usuarioRequest.senha());

        if (usuario != null) {
            return ResponseEntity.ok().body(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

    @PostMapping("/inserir")
    public ResponseEntity<Usuario> criaUsuario(@RequestBody UsuarioRequest usuarioRequest) throws Exception {
        try {
            Usuario usuario = usuarioService.cadastro(
                    usuarioRequest.nome(),
                    usuarioRequest.login(),
                    usuarioRequest.senha());

            return ResponseEntity.ok().body(usuario);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("/buscar") 
    public Usuario buscarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        return usuarioService.buscarUsuario(usuarioRequest.nome());
    }

}
