package com.ecommerce.commerce.test.dev.infraestructure.repository;

import com.ecommerce.commerce.test.dev.infraestructure.entity.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<Brands, Integer> {
}
