package com.ecommerce.commerce.test.dev.infraestructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prices")
@NamedQuery(name = "Prices.findByDatesAndProductAndBrand", query = "SELECT p FROM Prices p WHERE p.startDate >= " +
        ":startDate AND p.brand.brandId = :brandId " +
        "AND p.product.productId = :productId ORDER BY p.priority ASC LIMIT 1 ")
public class Prices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prices_id")
    private Integer pricesId;

    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "price")
    private float price;

    @Column(name = "curr")
    private String curr;

    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    @ManyToOne(optional = false)
    private Brands brand;

    @JoinColumn(name = "prices_list_id", referencedColumnName = "prices_list_id")
    @ManyToOne(optional = false)
    private PricesList pricesList;

    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    @ManyToOne(optional = false)
    private Products product;
}
