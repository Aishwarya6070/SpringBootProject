package com.shad.SpringBoot12.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shad.SpringBoot12.Model.Customer;
import com.shad.SpringBoot12.Model.Login;
import com.shad.SpringBoot12.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public void add(Customer customer) {
		customerRepository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public boolean validate(Login login) {

		String email = login.getEmail();
		String password = login.getPassword();

		Customer customer = customerRepository.findByEmailAndPassword(email, password);

		return customer != null;

	}

}