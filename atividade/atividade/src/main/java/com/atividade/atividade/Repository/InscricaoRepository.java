package com.atividade.atividade.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.atividade.Models.Inscricao;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {

     @Query(" SELECT inscricao FROM Inscricao inscricao WHERE inscricao.id = ?1 ")
     Optional<Inscricao> findById(Integer id);
     
    /*@Query(value = "SELECT c.cat_tx_nome AS categoria, u1.usu_tx_nome AS atleta1, u2.usu_tx_nome AS atleta2 FROM ins_inscricao i JOIN cat_categoria c ON i.cat_nr_id = c.cat_nr_id JOIN usu_usuario u1 ON i.usu_nr_id1 = u1.usu_nr_id JOIN usu_usuario u2 ON i.usu_nr_id2 = u2.usu_nr_id WHERE i.usu_nr_id1 = :id1 AND i.usu_nr_id2 = :id2 AND i.cat_nr_id = :id3", nativeQuery = true)
    List<Inscricao> findByUsuariosAndCategoria(@Param("id1") Long id1, @Param("id2") Long id2, @Param("id3") Long id3); */
}
