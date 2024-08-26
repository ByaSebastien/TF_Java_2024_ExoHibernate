package be.bstorm.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(callSuper = false)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person extends BaseEntity {

    @Getter @Setter
    @Column(length = 50,nullable = false)
    private String name;

    @Getter @Setter
    @Embedded
    private Address address;

    @Getter @Setter
    @Column(length = 50,nullable = false,unique = true)
    private String phoneNumber;
}
