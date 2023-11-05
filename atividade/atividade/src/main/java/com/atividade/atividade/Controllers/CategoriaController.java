package com.atividade.atividade.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.atividade.Models.Categoria;
import com.atividade.atividade.Records.CategoriaRequest;
import com.atividade.atividade.Services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/criar")
    public ResponseEntity<Categoria> addCategoria(@RequestBody CategoriaRequest categoriaRequest) {

        try {
            return categoriaService.addCategoria(categoriaRequest.idTorneio(), categoriaRequest.categoriaNome());
        } catch (Exception e) {
            // TODO: handle exception
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

    }

    @GetMapping("/recuperar")
    public ResponseEntity<List<Categoria>> recuperar(@RequestParam Integer id) {

        try {
            return ResponseEntity.ok().body(categoriaService.getAllByTorneioId(id));

        } catch (Exception e) {
            // TODO: handle exception
            return ResponseEntity.badRequest().body(null);
        }
    }
}
