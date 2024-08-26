package be.bstorm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(callSuper = true)
@Entity
public class Pilot extends Person{

    @Getter @Setter
    @Column(unique = true,nullable = false,length = 50)
    private String patent;
}
