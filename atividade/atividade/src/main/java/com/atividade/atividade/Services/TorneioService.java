package com.atividade.atividade.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.atividade.Models.Torneio;
import com.atividade.atividade.Repository.TorneioRepository;

import jakarta.transaction.Transactional;

@Service
public class TorneioService {
    @Autowired
    private TorneioRepository torneioRepository;

    @Transactional
    public Torneio criar(String nome) {
        Torneio torneio = new Torneio();

        torneio.setNome(nome);

        return torneioRepository.save(torneio);
    }

    public List<Torneio> getAll() {
        return torneioRepository.findAll();
    }
}
