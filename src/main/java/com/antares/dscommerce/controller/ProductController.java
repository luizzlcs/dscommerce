package com.antares.dscommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antares.dscommerce.dto.ProductDTO;
import com.antares.dscommerce.services.ProductServices;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductServices services;

	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		
		ProductDTO dto = services.findById(id);

		return dto;
	}

	@GetMapping
	public Page<ProductDTO> findAll(Pageable pageable) {
		return services.findAll(pageable);
	}

}
