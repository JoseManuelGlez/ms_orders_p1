package org.example.msapiordenes.application.services;

import org.example.msapiordenes.domain.model.Order;

public interface IOrderService {
    Order create(Order order);
    Iterable<Order> list();
    Order update(Order order, String id);
}
