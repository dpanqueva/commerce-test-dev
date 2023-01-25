package com.ecommerce.commerce.test.dev.infraestructure.repository;

import com.ecommerce.commerce.test.dev.infraestructure.entity.PricesList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesListRepository extends JpaRepository<PricesList, Integer> {
}
