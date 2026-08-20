package com.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Api.entities.Produto;

@Repository
public interface ProdutoRespository extends JpaRepository<Produto, Long> {
    
}
