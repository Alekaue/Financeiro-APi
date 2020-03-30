package com.example.financeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financeiro.api.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
	
}
