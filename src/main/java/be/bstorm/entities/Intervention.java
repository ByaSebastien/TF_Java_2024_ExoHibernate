package be.bstorm.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(callSuper = false)
@Entity
public class Intervention extends BaseEntity{

    @Getter @Setter
    @Column(unique = true,nullable = false)
    private String number;

    @Getter @Setter
    private String cause;

    @Getter @Setter
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime startDate;

    @Getter @Setter
    private int duration;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Plane plane;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanic repairMechanic;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanic monitorMechanic;
}
