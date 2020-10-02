package model;

public class CardPayment {

	
	private String creditCardNumber;
	private float amount;
	private int cvc;
	private String cardHolderFName;
	private String cardHolderLName;
	
	public CardPayment(){
		
	}
	//get card no
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	//set card no
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	//get amount
	public float getAmount() {
		return amount;
	}
	//set amount
	public void setAmount(float amount) {
		this.amount = amount;
	}
	//get cvc
	public int getCvc() {
		return cvc;
	}
	//set cvc
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	//get card holder fname
	public String getCardHolderFName() {
		return cardHolderFName;
	}
	//set card holder fname
	public void setCardHolderFName(String cardHolderFName) {
		this.cardHolderFName = cardHolderFName;
	}
	//get card holder lname
	public String getCardHolderLName() {
		return cardHolderLName;
	}
	//set card holder lname
	public void setCardHolderLName(String cardHolderLName) {
		this.cardHolderLName = cardHolderLName;
	}
	
}
