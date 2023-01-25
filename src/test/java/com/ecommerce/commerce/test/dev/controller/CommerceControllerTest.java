package com.ecommerce.commerce.test.dev.controller;

import com.ecommerce.commerce.test.dev.model.Model;
import com.ecommerce.commerce.test.dev.application.response.BrandsDto;
import com.ecommerce.commerce.test.dev.application.response.PricesDto;
import com.ecommerce.commerce.test.dev.application.response.ProductsDto;
import com.ecommerce.commerce.test.dev.application.request.SearchDto;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CommerceControllerTest {

    @LocalServerPort
    Integer port;

    @Autowired
    TestRestTemplate restTemplate;

    Model model;

    @BeforeEach
    void before(){
         model = new Model();

    }

    @SneakyThrows
    @Test
    void searchInfoTestT1() {
        Date startDate = model.convertStringToDateWithFormat("2020-06-14-10.00.00");

        SearchDto request = new SearchDto(startDate, null
                , new ProductsDto(35455, ""), new BrandsDto(1, ""));
        ResponseEntity<PricesDto> response = restTemplate.postForEntity("http://localhost:".concat(port.toString())
                .concat("/api/v1/search"), request, PricesDto.class);
        assertSame( HttpStatus.OK,response.getStatusCode());
    }

    @SneakyThrows
    @Test
    void searchInfoTestT2() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
        Date startDate = formatter.parse("2020-06-14-16.00.00");
        SearchDto request = new SearchDto(startDate, null
                , new ProductsDto(35455, ""), new BrandsDto(1, ""));
        ResponseEntity<PricesDto> response = restTemplate.postForEntity("http://localhost:".concat(port.toString())
                .concat("/api/v1/search"), request, PricesDto.class);
        assertSame( HttpStatus.OK,response.getStatusCode());
    }

    @SneakyThrows
    @Test
    void searchInfoTestT3() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
        Date startDate = formatter.parse("2020-06-14-21.00.00");
        Date endDate = formatter.parse("2020-06-14-21.00.00");
        SearchDto request = new SearchDto(startDate, endDate
                , new ProductsDto(35455, ""), new BrandsDto(1, ""));
        ResponseEntity<PricesDto> response = restTemplate.postForEntity("http://localhost:".concat(port.toString())
                .concat("/api/v1/search"), request, PricesDto.class);
        assertSame(HttpStatus.OK,response.getStatusCode());
    }

    @SneakyThrows
    @Test
    void searchInfoTestT4() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
        Date startDate = formatter.parse("2020-06-15-10.00.00");
        Date endDate = formatter.parse("2020-06-15-10.00.00");
        SearchDto request = new SearchDto(startDate, endDate
                , new ProductsDto(35455, ""), new BrandsDto(1, ""));
        ResponseEntity<PricesDto> response = restTemplate.postForEntity("http://localhost:".concat(port.toString())
                .concat("/api/v1/search"), request, PricesDto.class);
        assertSame( HttpStatus.OK,response.getStatusCode());
    }

    @SneakyThrows
    @Test
    void searchInfoTestT5(){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
            Date startDate = formatter.parse("2020-06-15-21.00.00");
            Date endDate = formatter.parse("2020-06-15-21.00.00");
            SearchDto request = new SearchDto(startDate, endDate
                    , new ProductsDto(35455, ""), new BrandsDto(1, ""));
            ResponseEntity<PricesDto> response = restTemplate.postForEntity("http://localhost:".concat(port.toString())
                    .concat("/api/v1/search"), request, PricesDto.class);
        assertSame( HttpStatus.NO_CONTENT,response.getStatusCode());
    }
}
