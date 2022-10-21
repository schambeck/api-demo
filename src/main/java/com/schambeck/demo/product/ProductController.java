package com.schambeck.demo.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("products")
class ProductController {

    List<Product> products = Arrays.asList(
            Product.builder()
                    .id(UUID.randomUUID())
                    .description("Prod 1")
                    .price(new BigDecimal("100.35"))
                    .category(Category.builder()
                            .id(UUID.randomUUID())
                            .description("Cat 1")
                            .build())
                    .build(),
            Product.builder()
                    .id(UUID.randomUUID())
                    .description("Prod 2")
                    .price(new BigDecimal("300.09"))
                    .category(Category.builder()
                            .id(UUID.randomUUID())
                            .description("Cat 2")
                            .build())
                    .build()
    );

    @GetMapping
    ResponseEntity<List<Product>> list() {
        return ResponseEntity.ok(products);
    }

}
