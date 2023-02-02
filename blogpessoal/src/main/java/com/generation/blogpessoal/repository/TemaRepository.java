package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemaRepository  extends JpaRepository<Tema, long> {
    public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
