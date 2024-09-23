package com.returnorder.componentprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.returnorder.componentprocess.model.ProcessResponse;

@Repository
public interface ProcessResponseRepository extends JpaRepository<ProcessResponse, Integer> {
	
}
