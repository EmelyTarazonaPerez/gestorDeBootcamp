package projects.bootcamp.contants;

import projects.bootcamp.adapters.driven.jpa.mysql.entity.BootcampEntity;
import projects.bootcamp.adapters.driven.jpa.mysql.entity.CapacityEntity;
import projects.bootcamp.adapters.driven.jpa.mysql.entity.TechnologyEntity;
import projects.bootcamp.adapters.driving.http.dto.response.bootcamp.AssociatedCapacity;
import projects.bootcamp.adapters.driving.http.dto.response.capacity.CapacityResponse;
import projects.bootcamp.adapters.driving.http.dto.response.technology.TechnologyResponse;
import projects.bootcamp.domain.model.Capacity;
import projects.bootcamp.domain.model.Technology;

import java.util.ArrayList;
import java.util.List;

public  class GetAssociatedTechList {
    public static List<TechnologyEntity> getTechnologyEntityList() {
        TechnologyEntity technology1 = new TechnologyEntity(1, "Java1", "Any description", null);
        TechnologyEntity technology2 = new TechnologyEntity(2, "Java2", "Any description", null);
        TechnologyEntity technology3 = new TechnologyEntity(3, "Java3", "Any description", null);

        List<TechnologyEntity> technologyEntitylist = new ArrayList<>();
        technologyEntitylist.add(technology1);
        technologyEntitylist.add(technology2);
        technologyEntitylist.add(technology3);
        return technologyEntitylist;
    }

    public static List<Capacity> getCapacityList (int inset) {
        int x = 0;
        List<Capacity> capacities = new ArrayList<>();
        while (x < inset){
            x++;
            capacities.add(new Capacity());
        }
        return capacities;
    }
    public static List<CapacityEntity> getCapacityEntityList (int inset) {
        int x = 0;
        List<CapacityEntity> capacityEntities = new ArrayList<>();
        while (x < inset){
            x++;
            capacityEntities.add(new CapacityEntity());
        }
        return capacityEntities;
    }
    public static List<AssociatedCapacity> getCapacityResponseList (int inset) {
        int x = 0;
        List<AssociatedCapacity> capacityResponses = new ArrayList<>();
        while (x < inset){
            x++;
            capacityResponses.add(new AssociatedCapacity(x,"Bootcam" + x ,  null));
        }
        return capacityResponses;
    }

    public static List<Technology> getTechnologyList() {
        Technology technology1 = new Technology(1, "Java1", "Any description");
        Technology technology2 = new Technology(2, "Java2", "Any description");
        Technology technology3 = new Technology(3, "Java3", "Any description");

        List<Technology> technologyList = new ArrayList<>();
        technologyList.add(technology1);
        technologyList.add(technology2);
        technologyList.add(technology3);
        return technologyList;
    }

    public static List<TechnologyResponse> getTechnologyResponseList () {
        TechnologyResponse technology1 = new TechnologyResponse(1, "Java1", "Any description");
        TechnologyResponse technology2 = new TechnologyResponse(2, "Java2", "Any description");
        TechnologyResponse technology3 = new TechnologyResponse(3, "Java3", "Any description");

        List<TechnologyResponse> technologyList = new ArrayList<>();
        technologyList.add(technology1);
        technologyList.add(technology2);
        technologyList.add(technology3);
        return technologyList;
    }




}
