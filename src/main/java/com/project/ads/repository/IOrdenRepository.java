package com.project.ads.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ads.model.Orden;
import com.project.ads.model.Usuario;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	List<Orden> findByUsuario (Usuario usuario);
}
