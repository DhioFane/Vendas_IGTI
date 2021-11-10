package com.dhiovani.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhiovani.vendas.DTO.ComprasDTO;
import com.dhiovani.vendas.entities.Compras;
import com.dhiovani.vendas.repositories.ComprasRepository;

@Service

public class ComprasService {
		
		@Autowired
		private ComprasRepository  comprasRepository;
		
		public List<ComprasDTO> findAll() {
			List<Compras>res= comprasRepository.findAll();
			return res.stream().map(c-> new ComprasDTO(c)).collect(Collectors.toList());
		}
}
