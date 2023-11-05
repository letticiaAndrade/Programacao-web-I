package com.atividade.atividade.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.atividade.Models.Torneio;
import com.atividade.atividade.Records.TorneioRequest;
import com.atividade.atividade.Services.TorneioService;

@RestController
@RequestMapping("/torneio")
public class TorneioController {
    
    @Autowired
    private TorneioService torneioService;

    @PostMapping("/criar")
    public Torneio criarTorneio(@RequestBody TorneioRequest torneioRequest) {
          return torneioService.criar(torneioRequest.nome());
    }

    @GetMapping("/getAll")
    public List<Torneio> getAll(){
        return torneioService.getAll();
    }
 }
