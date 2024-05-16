package org.example.msapiordenes.domain.model;

import lombok.Data;

@Data
public class Order {
    private String id;
    private Double total;
    private String date;
    private String status;
}
