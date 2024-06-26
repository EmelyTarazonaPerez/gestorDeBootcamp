package projects.bootcamp.domain.api;

import projects.bootcamp.domain.model.Capacity;

import java.util.List;

public interface ICapacityServicePort {
    Capacity save(Capacity capacity);
    List<Capacity> getAll(int size, int page, boolean directionTechAssociated, boolean order, int byCant, String name);

}
