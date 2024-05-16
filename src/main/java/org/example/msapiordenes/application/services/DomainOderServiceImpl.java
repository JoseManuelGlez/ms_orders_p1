package org.example.msapiordenes.application.services;

import org.example.msapiordenes.domain.model.Order;
import org.example.msapiordenes.domain.ports.IOrderRepository;

public class DomainOderServiceImpl implements  IOrderService{
    private final IOrderRepository repository;

    public DomainOderServiceImpl(IOrderRepository repository){
        this.repository = repository;
    }

    @Override
    public Order create(Order order) {
        return repository.create(order);
    }

    @Override
    public Iterable<Order> list() {
        return repository.list();
    }

    @Override
    public Order update(Order order, String id) {
        return repository.update(order, id);
    }
}
