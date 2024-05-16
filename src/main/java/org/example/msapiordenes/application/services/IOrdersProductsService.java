package org.example.msapiordenes.application.services;

import org.example.msapiordenes.domain.model.OrdersProducts;

public interface IOrdersProductsService {
    OrdersProducts create(OrdersProducts ordersProducts);
}
