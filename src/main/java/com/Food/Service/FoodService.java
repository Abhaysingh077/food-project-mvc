package com.Food.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Food.Entities.Customer;

@Service
public class FoodService {
	@Autowired
Payment user;
	public Customer getCustomer(int o_id) {
		return user.findById(o_id).get();
	}


}
