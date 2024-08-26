package be.bstorm.repositories;

import be.bstorm.entities.Pilot;

public class PilotRepositoryImpl extends BaseRepositoryImpl<Pilot,Long> implements PilotRepository {

    public PilotRepositoryImpl() {
        super(Pilot.class);
    }

//    @Override
//    public Class<Pilot> getEntityClass() {
//        return Pilot.class;
//    }
}
