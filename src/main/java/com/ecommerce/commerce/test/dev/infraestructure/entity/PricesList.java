package com.ecommerce.commerce.test.dev.infraestructure.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prices_list")
public class PricesList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prices_list_id")
    private Integer pricesListId;

    @Column(name = "value_price")
    private String value;

    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "pricesList")
    private List<Prices> pricesList;*/
}
