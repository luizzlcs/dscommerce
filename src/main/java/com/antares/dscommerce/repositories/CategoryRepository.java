package com.antares.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antares.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    

}
