package org.example.msapiordenes.application.services;

import org.example.msapiordenes.domain.model.OrdersProducts;
import org.example.msapiordenes.domain.ports.IOrdersProductsRepository;

public class DomainOrdersProductsServiceImpl implements IOrdersProductsService {
    private final IOrdersProductsRepository repository;

    public DomainOrdersProductsServiceImpl(IOrdersProductsRepository repository){
        this.repository = repository;
    }

    @Override
    public OrdersProducts create(OrdersProducts ordersProducts) {
        return repository.create(ordersProducts);
    }
}
