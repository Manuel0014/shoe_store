package com.project.ads.service;

import java.util.List;
import java.util.Optional;

import com.project.ads.model.Orden;
import com.project.ads.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
