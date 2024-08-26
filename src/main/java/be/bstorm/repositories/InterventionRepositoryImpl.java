package be.bstorm.repositories;

import be.bstorm.entities.Intervention;

public class InterventionRepositoryImpl extends BaseRepositoryImpl<Intervention,Long> implements InterventionRepository {

    public InterventionRepositoryImpl() {
        super(Intervention.class);
    }
}
