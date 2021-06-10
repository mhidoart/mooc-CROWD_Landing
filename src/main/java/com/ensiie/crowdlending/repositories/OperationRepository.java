package com.ensiie.crowdlending.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensiie.crowdlending.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Integer> {
	
}
