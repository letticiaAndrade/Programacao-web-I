package com.atividade.atividade.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tor_torneio")
public class Torneio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tor_nr_id")
    private Integer id;

    @Column(name = "tor_tx_nome")
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
    
}
