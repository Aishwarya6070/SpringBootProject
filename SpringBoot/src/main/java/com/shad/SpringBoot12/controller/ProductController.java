package com.shad.SpringBoot12.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shad.SpringBoot12.Model.Login;
import com.shad.SpringBoot12.Model.Product;
import com.shad.SpringBoot12.Service.ProductService;

@RestController
@RequestMapping("/api/")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	

	@GetMapping("/product")
	public List<Product> getAllProducts() {

		List<Product> allProducts = productService.getAllProducts();

		return allProducts;
	}

	@GetMapping("/product/{id}")
	public  Optional<Product> getProductById(@PathVariable long id) {

		return productService.getProductById(id);

		
	}

	@PostMapping("/product")
	public Product saveProdcut(@RequestBody Product product) {
		return productService.add(product);
	}

	@PutMapping("/product")
	public Product editProdcut(@RequestBody Product product) {
		return productService.edit(product);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable long id) {

		productService.deleteProductById(id);

	}

}

