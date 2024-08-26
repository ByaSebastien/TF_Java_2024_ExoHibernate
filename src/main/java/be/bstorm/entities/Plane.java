package be.bstorm.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(callSuper = false)
@Entity
public class Plane extends BaseEntity{

    @Getter @Setter
    @Column(unique = true,nullable = false,length = 50)
    private String licencePlate;

    @Temporal(TemporalType.DATE)
    private LocalDate purchaseDate;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    private Owner owner;

    @ManyToOne(fetch = FetchType.EAGER)
    private PlaneType planeType;
}
