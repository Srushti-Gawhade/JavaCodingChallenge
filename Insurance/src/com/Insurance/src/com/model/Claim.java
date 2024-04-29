package com.model;

import java.util.Objects;

public class Claim {
	private int claimId;
	private int claimNumber;
	private String dateFiled;
	private Double claimAmount;
	private String status;
	private String policy;//Represents the policy associated with the claim
	private Client client; // Represents the client associated with the claim
	
	
	public Claim(int claimId, int claimNumber, String dateFiled, Double claimAmount, String status, String policy,
			Client client) {
		super();
		this.claimId = claimId;
		this.claimNumber = claimNumber;
		this.dateFiled = dateFiled;
		this.claimAmount = claimAmount;
		this.status = status;
		this.policy = policy;
		this.client = client;
	}
	
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public int getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(int claimNumber) {
		this.claimNumber = claimNumber;
	}
	public String getDateFiled() {
		return dateFiled;
	}
	public void setDateFiled(String dateFiled) {
		this.dateFiled = dateFiled;
	}
	public Double getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(Double claimAmount) {
		this.claimAmount = claimAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", claimNumber=" + claimNumber + ", dateFiled=" + dateFiled
				+ ", claimAmount=" + claimAmount + ", status=" + status + ", policy=" + policy + ", client=" + client
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(claimAmount, claimId, claimNumber, client, dateFiled, policy, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Claim other = (Claim) obj;
		return Objects.equals(claimAmount, other.claimAmount) && claimId == other.claimId
				&& claimNumber == other.claimNumber && Objects.equals(client, other.client)
				&& Objects.equals(dateFiled, other.dateFiled) && Objects.equals(policy, other.policy)
				&& Objects.equals(status, other.status);
	}
	
	
	
	

}