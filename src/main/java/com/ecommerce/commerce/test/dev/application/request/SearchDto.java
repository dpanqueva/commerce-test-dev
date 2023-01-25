package com.ecommerce.commerce.test.dev.application.request;

import com.ecommerce.commerce.test.dev.application.response.BrandsDto;
import com.ecommerce.commerce.test.dev.application.response.ProductsDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchDto {


    @JsonFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    private Date startDate;
    @JsonFormat(pattern="yyyy-MM-dd-HH.mm.ss")
    private Date endDate;
    private ProductsDto product;
    private BrandsDto brand;

}
