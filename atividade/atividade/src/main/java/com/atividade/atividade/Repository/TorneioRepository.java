package com.atividade.atividade.Repository;
import com.atividade.atividade.Models.Torneio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TorneioRepository extends JpaRepository<Torneio, Integer> {
    
}
