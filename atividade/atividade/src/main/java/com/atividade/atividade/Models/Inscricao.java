package com.atividade.atividade.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "ins_inscricao")
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ins_nr_id")
    private Integer id;

    @Column(name = "cat_nr_id")
    private Integer categoriaId;

    @Column(name = "usu_nr_id1")
    private Integer userId1;

    @Column(name = "usu_nr_id2")
    private Integer userId2;

    public Integer getId() {
        return this.id;
    }

    public Integer getCategoriaId() {
        return this.categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getUserId1() {
        return this.userId1;
    }

    public void setUserId1(Integer userId1) {
        this.userId1 = userId1;
    }

    public Integer getUserId2() {
        return this.userId2;
    }

    public void setUserId2(Integer userId2) {
        this.userId2 = userId2;
    }
    
}
