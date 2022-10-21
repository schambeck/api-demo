package com.schambeck.demo.product;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class Product {

    private UUID id;
    private String description;
    private BigDecimal price;
    private Category category;
}
