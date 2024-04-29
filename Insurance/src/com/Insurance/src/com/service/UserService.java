package com.service;

import java.util.List;

import com.dao.IPolicyService;
import com.dao.IPolicyServiceImpl;
import com.exception.PolicyNotFoundException;
import com.exception.ResourceNotFoundException;
import com.model.User;

public class UserService {
	IPolicyService dao = new IPolicyServiceImpl();

	public int insert(User user) {
		return dao.save(user);
		
	}

	public void deleteByid(int policyId) throws PolicyNotFoundException {
		
		boolean isIdValid = dao.findOne(policyId) ;
		if(isIdValid)
			throw new PolicyNotFoundException("Id given is Invalid!!");
		
		dao.deleteById(policyId);
		
	}



	public List<User> findAll() {
		return dao.findAll();
	}

	public void softDeleteByid(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	

}
