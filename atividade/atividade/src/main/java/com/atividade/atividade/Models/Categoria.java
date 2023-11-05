package com.atividade.atividade.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "cat_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_nr_id")
    private Integer id;

    @Column(name = "tor_nr_id")
    private Integer idTorneio;

    @Column(name = "cat_tx_nome")
    private String nomeCat;


    public Integer getId() {
        return this.id;
    }

    public Integer getTorneioId() {
        return this.idTorneio;
    }

    public void setTorneioId(Integer torneioId) {
        this.idTorneio = torneioId;
    }

    public String getNomeCat() {
        return this.nomeCat;
    }

    public void setNomeCat(String nomeCat) {
        this.nomeCat = nomeCat;
    }

}
