package comeng.sa.no12.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;

@Entity
@Data
@Table(name = "initial")
@NoArgsConstructor
public class Initial {
    @Id
    @SequenceGenerator(name = "initial_seq", sequenceName = "initial_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "initial_seq")

    private Long initialId;
    private String initialName;

}
