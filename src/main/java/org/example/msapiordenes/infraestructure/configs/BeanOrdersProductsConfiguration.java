package org.example.msapiordenes.infraestructure.configs;

import org.example.msapiordenes.application.services.DomainOrdersProductsServiceImpl;
import org.example.msapiordenes.application.services.IOrdersProductsService;
import org.example.msapiordenes.domain.ports.IOrdersProductsRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanOrdersProductsConfiguration {
    @Bean
    IOrdersProductsService ordenesProductosBeanService(final IOrdersProductsRepository repository){
        return new DomainOrdersProductsServiceImpl(repository);
    }
}
