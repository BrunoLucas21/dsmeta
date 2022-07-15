package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	/**
	 * Método que busca todas as vendas do banco de dados
	 * @return todas as vendas do banco de dados
	 */
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
