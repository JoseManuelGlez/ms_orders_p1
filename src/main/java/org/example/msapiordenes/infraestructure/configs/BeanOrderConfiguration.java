package org.example.msapiordenes.infraestructure.configs;

import org.example.msapiordenes.application.services.DomainOderServiceImpl;
import org.example.msapiordenes.application.services.IOrderService;
import org.example.msapiordenes.domain.ports.IOrderRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class BeanOrderConfiguration {
    @Bean
    IOrderService orderBeanService(final IOrderRepository repository){
        return new DomainOderServiceImpl(repository);
    }
}
