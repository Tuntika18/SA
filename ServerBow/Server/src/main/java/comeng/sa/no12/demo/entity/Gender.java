package comeng.sa.no12.demo.entity;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;

@Entity
@Data
@Table(name = "gender")
@NoArgsConstructor
public class Gender {
    @Id
    @SequenceGenerator(name = "gender_seq", sequenceName = "gender_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gender_seq")

    private Long genderId;
    private String sex;

}