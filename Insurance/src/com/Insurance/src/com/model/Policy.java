package com.model;

import java.util.Objects;

public class Policy {
	private int policyId;
	private String name;
	private Double premium;
	private int rateOfInterest;
	
	public Policy(int policyId, String name, Double premium, int rateOfInterest  ) {
		super();
		this.policyId = policyId;
		this.name = name;
		this.premium = premium;
		this.rateOfInterest = rateOfInterest;
	}
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPremium() {
		return premium;
	}
	public void setPremium(Double premium) {
		this.premium = premium;
	}
	public int getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", name=" + name + ", premium=" + premium + ", rateOfInterest="
				+ rateOfInterest + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, policyId, premium, rateOfInterest);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policy other = (Policy) obj;
		return Objects.equals(name, other.name) && policyId == other.policyId && Objects.equals(premium, other.premium)
				&& rateOfInterest == other.rateOfInterest;
	}
	
	

}
