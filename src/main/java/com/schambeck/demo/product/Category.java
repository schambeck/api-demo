package com.schambeck.demo.product;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Category {

    private UUID id;
    private String description;

}
