package model;

public class CardPayment {

	
	private String creditCardNumber;
	private float amount;
	private int cvc;
	private String cardHolderFName;
	private String cardHolderLName;
	
	public CardPayment(){
		
	}
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public String getCardHolderFName() {
		return cardHolderFName;
	}
	public void setCardHolderFName(String cardHolderFName) {
		this.cardHolderFName = cardHolderFName;
	}
	public String getCardHolderLName() {
		return cardHolderLName;
	}
	public void setCardHolderLName(String cardHolderLName) {
		this.cardHolderLName = cardHolderLName;
	}
	
}
