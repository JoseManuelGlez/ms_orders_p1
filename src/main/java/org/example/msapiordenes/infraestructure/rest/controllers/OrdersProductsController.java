package org.example.msapiordenes.infraestructure.rest.controllers;

import lombok.extern.slf4j.Slf4j;
import org.example.msapiordenes.application.services.IOrdersProductsService;
import org.example.msapiordenes.domain.model.OrdersProducts;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ordenes-productos")
@Slf4j
public class OrdersProductsController {
    private final IOrdersProductsService service;

    public OrdersProductsController(IOrdersProductsService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<OrdersProducts> create(@RequestBody OrdersProducts ordersProducts){
        return new ResponseEntity<>(service.create(ordersProducts), HttpStatus.CREATED);
    }
}
