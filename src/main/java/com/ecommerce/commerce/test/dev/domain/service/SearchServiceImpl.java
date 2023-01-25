package com.ecommerce.commerce.test.dev.domain.service;

import com.ecommerce.commerce.test.dev.application.request.SearchDto;
import com.ecommerce.commerce.test.dev.application.response.PricesDto;
import com.ecommerce.commerce.test.dev.domain.repository.IPricesRepository;
import com.ecommerce.commerce.test.dev.infraestructure.entity.Prices;
import com.ecommerce.commerce.test.dev.infraestructure.exceptions.NotContentException;
import com.ecommerce.commerce.test.dev.infraestructure.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements ISearchServices {

    @Autowired
    private IPricesRepository pricesRepository;

    @Autowired
    private MapperUtil mapperUtil;

    @Override
    public PricesDto searchByDatesAndProductAndBrand(SearchDto search) {
        Prices prices = pricesRepository.findByDatesAndProductAndBrand(search.getStartDate(),
                search.getProduct().getProductId(), search.getBrand().getBrandId());
        if (prices == null) {
            throw new NotContentException("Not found information for request sent");
        }
        return mapperUtil.map(prices, PricesDto.class);
    }
}
