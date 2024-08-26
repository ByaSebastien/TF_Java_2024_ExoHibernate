package be.bstorm.repositories;

import be.bstorm.entities.Plane;

public class PlaneRepositoryImpl extends BaseRepositoryImpl<Plane,Long> implements PlaneRepository {

    public PlaneRepositoryImpl() {
        super(Plane.class);
    }
}
