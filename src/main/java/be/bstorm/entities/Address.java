package be.bstorm.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
@Embeddable
public class Address {

    @Getter @Setter
    private String street;
    @Getter @Setter
    private String city;
    @Getter @Setter
    private String state;
    @Getter @Setter
    private String zip;
}
