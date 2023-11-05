package com.atividade.atividade.Controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.atividade.Models.Inscricao;
import com.atividade.atividade.Records.InscricaoRequest;
import com.atividade.atividade.Services.InscricaoService;

@RestController
@RequestMapping("/inscricao")
public class InscricaoController {
    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping("/inserir")
    public Inscricao inscrever(@RequestBody InscricaoRequest inscricaoRequest) {
        return inscricaoService.inscricao(
            inscricaoRequest.categoriaId(),
            inscricaoRequest.userId1(),
            inscricaoRequest.userId2());
    }

      @GetMapping("/buscar")
    public ResponseEntity<Optional<Inscricao>> buscar(@RequestParam Integer id) {
      
        try {
            return ResponseEntity.ok().body(inscricaoService.buscar(id));

        } catch (Exception e) {
            // TODO: handle exception
            return ResponseEntity.badRequest().body(null);
        }

 
    }
    
}
