package com.ecommerce.commerce.test.dev.domain.repository;

import com.ecommerce.commerce.test.dev.infraestructure.entity.Prices;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface IPricesRepository {

    Prices findByDatesAndProductAndBrand(@Param("startDate") Date startDate
            , @Param("productId") Integer productId, @Param("brandId") Integer brandId);

}
