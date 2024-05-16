package org.example.msapiordenes.infraestructure.adapters;

import org.example.msapiordenes.infraestructure.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface IOrderCrudRepositoryMySql extends CrudRepository<OrderEntity, String> {
}
