package com.softstream.despesa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softstream.despesa.entities.Mes;
import com.softstream.despesa.repositores.MesRepository;
import com.softstream.despesa.services.exception.ResourceNotFoundException;



@Service
public class MesService {

	@Autowired
	private MesRepository repository;

	@Transactional(readOnly = true)
	public Mes findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não Encontrado"));
	}


}
