package comeng.sa.no12.demo.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@Table(name = "customer")
@NoArgsConstructor
public class Customer {

    @Id
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String customerEmail;
    private String customerUserID;
    private String customerPassword;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genderId")
    private Gender gender;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "initialId")
    private Initial initial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "provinceId")
    private Province province;


}