package hwjdev12.service;


import jakarta.persistence.*;
import lombok.Data;


import java.util.Objects;
@Table( name= "client")
@Entity
@Data
public class Client {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private long id;
    @Column
    private String name;


}
