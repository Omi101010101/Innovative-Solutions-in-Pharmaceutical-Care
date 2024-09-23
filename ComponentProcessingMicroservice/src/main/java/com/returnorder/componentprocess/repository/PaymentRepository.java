package com.returnorder.componentprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.returnorder.componentprocess.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
