package be.bstorm.entities;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor @NoArgsConstructor
@ToString @EqualsAndHashCode
@MappedSuperclass
public class BaseEntity {

    @Getter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @CreationTimestamp
    public LocalDateTime createdAt;

    @Getter
    @UpdateTimestamp
    public LocalDateTime updatedAt;
}
