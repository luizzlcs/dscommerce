package com.antares.dscommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antares.dscommerce.dto.CategoryDTO;
import com.antares.dscommerce.entities.Category;
import com.antares.dscommerce.repositories.CategoryRepository;

@Service
public class CategorytService {

    @Autowired
    CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }

}
