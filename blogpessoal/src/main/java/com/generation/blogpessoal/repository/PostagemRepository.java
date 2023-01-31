package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
