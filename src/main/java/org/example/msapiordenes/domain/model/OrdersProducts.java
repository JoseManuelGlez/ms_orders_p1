package org.example.msapiordenes.domain.model;

import lombok.Data;

@Data
public class OrdersProducts {
    private String id;
    private String productId;
    private Double precio;
    private Double cantidad;
}
