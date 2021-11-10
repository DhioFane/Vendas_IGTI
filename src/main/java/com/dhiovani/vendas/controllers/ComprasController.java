package com.dhiovani.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dhiovani.vendas.DTO.ComprasDTO;
import com.dhiovani.vendas.service.ComprasService;

@RestController
@RequestMapping("/compras")
public class ComprasController {
	@Autowired
	private ComprasService comprasServices;

	@GetMapping
	public ResponseEntity<List<ComprasDTO>> findAll() {
		List<ComprasDTO> lista = comprasServices.findAll();
		return ResponseEntity.ok(lista);
}
}
