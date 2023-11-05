package com.atividade.atividade.Models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usu_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_nr_id")
    private Integer id;

    @Column(name = "usu_tx_nome")
    private String nome;

    @Column(name = "usu_tx_login")
    private String login;

    @Column(name = "usu_tx_senha")
    private String senha;

    @Column(name = "usu_cadastro")
    private LocalDateTime cadastro;

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return String return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return LocalDateTime return the cadastro
     */
    public LocalDateTime getCadastro() {
        return cadastro;
    }

    /**
     * @param cadastro the cadastro to set
     */
    public void setCadastro(LocalDateTime cadastro) {
        this.cadastro = cadastro;
    }

}
