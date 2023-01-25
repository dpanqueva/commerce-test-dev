package com.ecommerce.commerce.test.dev.application.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PricesDto {

    private ProductsDto product;

    private BrandsDto brand;

    private float price;

    private Date startDate;

    private Date endDate;

}
