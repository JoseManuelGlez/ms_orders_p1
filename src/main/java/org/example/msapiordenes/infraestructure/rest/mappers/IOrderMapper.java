package org.example.msapiordenes.infraestructure.rest.mappers;

import org.example.msapiordenes.domain.model.Order;
import org.example.msapiordenes.infraestructure.entities.OrderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IOrderMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "date", target = "date"),
            @Mapping(source = "status", target = "status"),
    }
    )
    Order toOrder(OrderEntity order);
    Iterable<Order> toOrders(Iterable<OrderEntity> orderEntities);

    @InheritInverseConfiguration
    OrderEntity toOrderEntity(Order order);

    Order toOrder(Optional<OrderEntity> order);
}
