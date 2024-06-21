package com.softstream.despesa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softstream.despesa.entities.Mes;
import com.softstream.despesa.repositores.MesRepository;

@Service
public class MesService {

	@Autowired
	private MesRepository repository;

	public Mes findById(Long id) {
		return null;
	}


}
