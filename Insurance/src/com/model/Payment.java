package com.model;

import java.util.Objects;

public class Payment {
	private int paymentId;
	private String paymentDate;
	private Double paymentAmount;
	private Client client; // Represents the client associated with the payment
	
	
	public Payment(int paymentId, String paymentDate, Double paymentAmount, Client client) {
		super();
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
		this.client = client;
	}


	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public String getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}


	public Double getPaymentAmount() {
		return paymentAmount;
	}


	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentAmount=" + paymentAmount
				+ ", client=" + client + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(client, paymentAmount, paymentDate, paymentId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(client, other.client) && Objects.equals(paymentAmount, other.paymentAmount)
				&& Objects.equals(paymentDate, other.paymentDate) && paymentId == other.paymentId;
	}
	
	
	

}
