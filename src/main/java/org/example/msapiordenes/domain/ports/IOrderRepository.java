package org.example.msapiordenes.domain.ports;

import org.example.msapiordenes.domain.model.Order;

public interface IOrderRepository {
    Order create(Order order);
    Iterable<Order> list();
    Order update(Order order, String id);
}
