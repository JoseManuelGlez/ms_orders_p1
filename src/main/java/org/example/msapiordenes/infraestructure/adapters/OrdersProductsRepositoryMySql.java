package org.example.msapiordenes.infraestructure.adapters;

import lombok.extern.slf4j.Slf4j;
import org.example.msapiordenes.domain.model.OrdersProducts;
import org.example.msapiordenes.domain.ports.IOrdersProductsRepository;
import org.example.msapiordenes.infraestructure.entities.OrdersProductsEntity;
import org.example.msapiordenes.infraestructure.rest.mappers.IOrdersProductsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrdersProductsRepositoryMySql implements IOrdersProductsRepository {
    private final OrdersProductsCrudRepositoryMySql repository;

    @Autowired
    private IOrdersProductsMapper iOrdenesProductosMapper;

    public OrdersProductsRepositoryMySql(OrdersProductsCrudRepositoryMySql repository){
        this.repository = repository;
    }

    @Override
    public OrdersProducts create(OrdersProducts ordersProducts) {
        OrdersProductsEntity ordenesProductosEntity = this.iOrdenesProductosMapper.toOrdenesProductosEntity(ordersProducts);
        return this.iOrdenesProductosMapper.toOrdenesProductos(this.repository.save(ordenesProductosEntity));
    }
}
