package com.atividade.atividade.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.atividade.atividade.Models.Categoria;
import com.atividade.atividade.Repository.CategoriaRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Transactional
    public ResponseEntity<Categoria> addCategoria(Integer torneioId, String nomeCategoria) {

        try {
             Categoria categoria = new Categoria();

        categoria.setTorneioId(torneioId);
        categoria.setNomeCat(nomeCategoria);

        return ResponseEntity.ok().body(categoriaRepository.save(categoria));
            
        } catch (Exception e) {
            // TODO: handle exception
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
       
    }

    public List<Categoria> getAllByTorneioId(Integer idTorneio) {
        return categoriaRepository.getAllByTorneioId(idTorneio);
    }

}
