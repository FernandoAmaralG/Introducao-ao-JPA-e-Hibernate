package com.ferworks.ferfood.domain.repository;

import java.util.List;

import com.ferworks.ferfood.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> todas();
	Restaurante porId(Long id);
	Restaurante adicionar(Restaurante restaurante);
	void remover(Restaurante restaurante);
	
}
