package org.example.msapiordenes.infraestructure.rest.mappers;

import org.example.msapiordenes.domain.model.OrdersProducts;
import org.example.msapiordenes.infraestructure.entities.OrdersProductsEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface IOrdersProductsMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "productId", target = "productId"),
            @Mapping(source = "precio", target = "precio"),
            @Mapping(source = "cantidad", target = "cantidad"),
    }
    )
    OrdersProducts toOrdenesProductos(OrdersProductsEntity ordenesProductos);
    Iterable<OrdersProducts> toOrdenesProductos(Iterable<OrdersProductsEntity> ordenesProductosEntities);

    @InheritInverseConfiguration
    OrdersProductsEntity toOrdenesProductosEntity(OrdersProducts ordersProducts);

    OrdersProducts toOrdenesProductos(Optional<OrdersProductsEntity> ordenesProductos);
}
