package com.ecommerce.commerce.test.dev.application.rest;

import com.ecommerce.commerce.test.dev.application.response.PricesDto;
import com.ecommerce.commerce.test.dev.application.request.SearchDto;
import com.ecommerce.commerce.test.dev.domain.service.ISearchServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class CommerceController {

    @Autowired
    private ISearchServices searchServices;

    @PostMapping("/search")
    public ResponseEntity<PricesDto> searchInfo(@RequestBody SearchDto search){
        return ResponseEntity.ok(searchServices.searchByDatesAndProductAndBrand(search));
    }
}
