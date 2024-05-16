package org.example.msapiordenes.infraestructure.rest.controllers;

import lombok.extern.slf4j.Slf4j;
import org.example.msapiordenes.application.services.IOrderService;
import org.example.msapiordenes.domain.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    private final IOrderService service;

    public OrderController(IOrderService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order){
        return new ResponseEntity<>(service.create(order), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Order>> list(){
        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Order> update(@RequestBody Order order, @PathVariable String id){
        return new ResponseEntity<>(service.update(order, id), HttpStatus.OK);
    }
}
