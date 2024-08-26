package be.bstorm.entities;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(callSuper = false)
@Entity
public class PlaneType extends BaseEntity {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String manufacturer;

    @Getter @Setter
    private int power;

    @Getter @Setter
    private int nbOfSeats;
}
