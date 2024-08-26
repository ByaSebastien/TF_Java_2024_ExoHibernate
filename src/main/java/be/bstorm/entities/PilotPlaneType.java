package be.bstorm.entities;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(callSuper = false)
@Entity
public class PilotPlaneType{

    @Id
    @EmbeddedId
    private PilotPlaneTypeId id;

    @Getter @Setter
    private int time;

    @Getter @Setter
    @ManyToOne
    @MapsId("pilotId")
    private Pilot pilot;

    @Getter @Setter
    @ManyToOne
    @MapsId("planeTypeId")
    private PlaneType planeType;

    @Embeddable
    private static class PilotPlaneTypeId implements Serializable {

        private Long pilotId;
        private Long planeTypeId;
    }
}
