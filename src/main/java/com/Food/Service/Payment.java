package com.Food.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Food.Entities.Customer;

public interface Payment extends JpaRepository<Customer ,Integer> {
}