package com.ecommerce.commerce.test.dev.infraestructure.repository;

import com.ecommerce.commerce.test.dev.domain.repository.IPricesRepository;
import com.ecommerce.commerce.test.dev.infraestructure.entity.Prices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class H2DbRepositoryI implements IPricesRepository {

    @Autowired
    private PricesRepository pricesRepository;

    @Override
    public Prices findByDatesAndProductAndBrand(Date startDate, Integer productId, Integer brandId) {
        return pricesRepository.findByDatesAndProductAndBrand(startDate,
                productId,brandId);
    }
}
