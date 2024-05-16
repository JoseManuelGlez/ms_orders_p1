package org.example.msapiordenes.domain.ports;

import org.example.msapiordenes.domain.model.OrdersProducts;

public interface IOrdersProductsRepository {
    OrdersProducts create(OrdersProducts ordersProducts);
}
