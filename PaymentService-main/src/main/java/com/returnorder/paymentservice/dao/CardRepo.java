package com.returnorder.paymentservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.returnorder.paymentservice.exception.CardNotFoundException;
import com.returnorder.paymentservice.model.CreditCard;

public interface CardRepo extends JpaRepository<CreditCard, String>{

	CreditCard findByCardNumber(long cardNumber)throws CardNotFoundException;

}
