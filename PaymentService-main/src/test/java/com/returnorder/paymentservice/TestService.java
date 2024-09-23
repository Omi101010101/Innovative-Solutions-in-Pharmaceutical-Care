package com.returnorder.paymentservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.returnorder.paymentservice.dao.CardRepo;
import com.returnorder.paymentservice.model.CreditCard;
import com.returnorder.paymentservice.service.CardService;

@ExtendWith(MockitoExtension.class)
class TestService {

	/*
	 * @BeforeAll public void init() { MockitoAnnotations.initMocks(this); }
	 */
	@Mock
	CardRepo repo;
	
	@Mock
	CreditCard card;
	
	@InjectMocks
	CardService service;
	
	@Test
	void testProcessPayment() {
		
		card=new CreditCard(1234567890,4000);
		when(repo.findByCardNumber(1234567L)).thenReturn(card);
		when(repo.save(any(CreditCard.class))).thenReturn(card);
		
		
		assertEquals(2000.0,service.processPayment(1234567L, 2000),0.00);
		assertEquals(-1,service.processPayment(1234567L, 5000),0.0);
		
	}
}
