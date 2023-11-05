package com.atividade.atividade.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.atividade.atividade.Models.Inscricao;
import com.atividade.atividade.Repository.InscricaoRepository;

import jakarta.transaction.Transactional;

@Service
public class InscricaoService {
    
    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Transactional
    public Inscricao inscricao (Integer categoriaId, Integer userId1, Integer userId2) {
        Inscricao inscricao = new Inscricao();
        inscricao.setCategoriaId(categoriaId);
        inscricao.setUserId1(userId1);
        inscricao.setUserId2(userId2);

        return inscricaoRepository.save(inscricao);
    }

     public Optional<Inscricao> buscar(Integer id) {
        return inscricaoRepository.findById(id);
    }


}
