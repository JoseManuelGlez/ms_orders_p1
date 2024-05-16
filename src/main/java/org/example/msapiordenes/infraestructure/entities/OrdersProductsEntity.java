package org.example.msapiordenes.infraestructure.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ordenes_productos")
@NoArgsConstructor
@Data
public class OrdersProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String productId;
    private Double precio;
    private Double cantidad;
}
