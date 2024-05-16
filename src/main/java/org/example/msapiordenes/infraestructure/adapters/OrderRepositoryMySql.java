package org.example.msapiordenes.infraestructure.adapters;

import lombok.extern.slf4j.Slf4j;
import org.example.msapiordenes.domain.model.Order;
import org.example.msapiordenes.domain.model.OrdersProducts;
import org.example.msapiordenes.domain.ports.IOrderRepository;
import org.example.msapiordenes.infraestructure.entities.OrderEntity;
import org.example.msapiordenes.infraestructure.entities.OrdersProductsEntity;
import org.example.msapiordenes.infraestructure.rest.mappers.IOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class OrderRepositoryMySql implements IOrderRepository {
    private final IOrderCrudRepositoryMySql repository;

    @Autowired
    private IOrderMapper iOrderMapper;

    public OrderRepositoryMySql(IOrderCrudRepositoryMySql repository){
        this.repository = repository;
    }

    @Override
    public Order create(Order order) {
        OrderEntity orderEntity = this.iOrderMapper.toOrderEntity(order);
        return this.iOrderMapper.toOrder(this.repository.save(orderEntity));
    }

    @Override
    public Iterable<Order> list() {
        return this.iOrderMapper.toOrders(this.repository.findAll());
    }

    @Override
    public Order update(Order order, String id) {
        OrderEntity entity = findOneAndEnsureExist(id);
        entity.setStatus(order.getStatus());

        return this.iOrderMapper.toOrder(this.repository.save(entity));
    }

    private OrderEntity findOneAndEnsureExist(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("The user does not exist"));
    }
}
