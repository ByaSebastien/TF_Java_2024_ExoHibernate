package be.bstorm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@ToString @EqualsAndHashCode(callSuper = true)
@Entity
public class Mechanic  extends Person{

    @ManyToMany
    private Set<PlaneType> authorizedPlaneType;

    public Mechanic(){
        authorizedPlaneType = new HashSet<>();
    }

    public Set<PlaneType> getAuthorizedPlaneType() {
        return Set.copyOf(this.authorizedPlaneType);
    }

    public void addPlaneType(PlaneType planeType){
        this.authorizedPlaneType.add(planeType);
    }

    public void removePlaneType(PlaneType planeType){
        this.authorizedPlaneType.remove(planeType);
    }
}
