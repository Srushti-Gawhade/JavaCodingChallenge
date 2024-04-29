package com.dao;

import java.util.Collection;

import com.model.Policy;
import com.model.User;

public interface IPolicyService {
	 boolean createPolicy(Policy policy);
	    Policy getPolicy(int policyId);
	    Collection<Policy> getAllPolicies();
	    boolean updatePolicy(Policy policy);
		int save(User user);
		boolean deletePolicy(int policyId);
		boolean findOne(int policyId);
		void deleteById(int policyId);
	    
}

	


