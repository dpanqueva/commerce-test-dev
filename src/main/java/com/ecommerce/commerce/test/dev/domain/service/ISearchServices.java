package com.ecommerce.commerce.test.dev.domain.service;

import com.ecommerce.commerce.test.dev.application.response.PricesDto;
import com.ecommerce.commerce.test.dev.application.request.SearchDto;

public interface ISearchServices {

    public PricesDto searchByDatesAndProductAndBrand(SearchDto search);
}
