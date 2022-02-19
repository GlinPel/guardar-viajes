package com.gleenpeltroche.guardarviajes.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gleenpeltroche.guardarviajes.models.Gasto;

public interface GastoRepository extends CrudRepository<Gasto, Long> {
	List<Gasto> findAll();
}
