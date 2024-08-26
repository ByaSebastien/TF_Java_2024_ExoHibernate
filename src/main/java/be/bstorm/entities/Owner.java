package be.bstorm.entities;

import jakarta.persistence.*;
import lombok.*;


@ToString @EqualsAndHashCode(callSuper = true)
@Entity
public class Owner extends Person{
}
