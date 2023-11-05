package com.atividade.atividade.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atividade.atividade.Models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
    @Query("SELECT c FROM Categoria c WHERE c.idTorneio = :idTorneio")
    List<Categoria> getAllByTorneioId(@Param("idTorneio") Integer idTorneio);
    
}
