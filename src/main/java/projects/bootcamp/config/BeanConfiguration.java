package projects.bootcamp.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import projects.bootcamp.adapters.driven.jpa.mysql.adapter.CapacityAdapter;
import projects.bootcamp.adapters.driven.jpa.mysql.adapter.TechnologyAdapter;
import projects.bootcamp.adapters.driven.jpa.mysql.mapper.ICapacityEntityMapper;
import projects.bootcamp.adapters.driven.jpa.mysql.mapper.ITechnologyEntityMapper;
import projects.bootcamp.adapters.driven.jpa.mysql.repository.ICapacityRepository;
import projects.bootcamp.adapters.driven.jpa.mysql.repository.ITechnologyRepository;
import projects.bootcamp.domain.api.ICapacityServicePort;
import projects.bootcamp.domain.api.ITechnologyServicePort;
import projects.bootcamp.domain.api.useCase.CapacityCase;
import projects.bootcamp.domain.api.useCase.TechnologyCase;
import projects.bootcamp.domain.spi.ICapacityPersistencePort;
import projects.bootcamp.domain.spi.ITechnologyPersistencePort;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ITechnologyRepository technologyRepository;
    private final ITechnologyEntityMapper technologyEntityMapper;
    private final ICapacityRepository capacityRepository;
    private final ICapacityEntityMapper capacityEntityMapper;
    @Bean
    public ITechnologyPersistencePort technologyPersistencePort(){
        return new TechnologyAdapter(technologyRepository, technologyEntityMapper);
    }
    @Bean
    public ITechnologyServicePort technologyServicePort(){
        return new TechnologyCase(technologyPersistencePort());
    }
    @Bean
    public ICapacityPersistencePort capacityPersistencePort () {
        return new CapacityAdapter(capacityRepository, capacityEntityMapper);
    }
    @Bean
    public ICapacityServicePort capacityServicePort () {
        return new CapacityCase(capacityPersistencePort());
    }
}
