package com.ecommerce.commerce.test.dev.infraestructure.repository;

import com.ecommerce.commerce.test.dev.infraestructure.entity.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PricesRepository extends JpaRepository<Prices, Integer> {

    public Prices findByDatesAndProductAndBrand(@Param("startDate") Date startDate

            , @Param("productId") Integer productId,@Param("brandId") Integer brandId);
}
