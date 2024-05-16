package org.example.msapiordenes.infraestructure.adapters;

import org.example.msapiordenes.infraestructure.entities.OrdersProductsEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersProductsCrudRepositoryMySql extends CrudRepository<OrdersProductsEntity, String> {
}
