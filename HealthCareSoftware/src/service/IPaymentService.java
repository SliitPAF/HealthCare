package service;

import java.util.ArrayList;

import model.CardPayment;

public interface IPaymentService {

	
	ArrayList<CardPayment> getCartPayments();

	CardPayment getCardPaymentByID(String PaymentID);
	
}
