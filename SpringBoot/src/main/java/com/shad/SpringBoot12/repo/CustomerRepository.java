package com.shad.SpringBoot12.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shad.SpringBoot12.Model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

	Customer findByEmailAndPassword(String email, String password);

}
