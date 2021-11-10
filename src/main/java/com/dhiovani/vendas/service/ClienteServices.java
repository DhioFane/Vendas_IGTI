package com.dhiovani.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.dhiovani.vendas.DTO.ClienteDTO;
import com.dhiovani.vendas.entities.Cliente;
import com.dhiovani.vendas.repositories.ClienteRepository;

@Service
public class ClienteServices {
	

	private ClienteRepository  clienteRepository;
	
	public List<ClienteDTO> findAll() {
		List<Cliente>res= clienteRepository.findAll();
		return res.stream().map(c-> new ClienteDTO(c)).collect(Collectors.toList());
}
}
