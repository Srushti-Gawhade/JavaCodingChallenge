package com.model;

import java.util.Objects;

public class Client {
	private int clientId;
	private String clientName;
	private String contactInfo;
	private String policy;//Represents the policy associated with the client
	
	public Client(int clientId, String clientName, String contactInfo, String policy) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.contactInfo = contactInfo;
		this.policy = policy;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", contactInfo=" + contactInfo
				+ ", policy=" + policy + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(clientId, clientName, contactInfo, policy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return clientId == other.clientId && Objects.equals(clientName, other.clientName)
				&& contactInfo == other.contactInfo && Objects.equals(policy, other.policy);
	}
	
	

}