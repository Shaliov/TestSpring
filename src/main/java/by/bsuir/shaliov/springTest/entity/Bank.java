package by.bsuir.shaliov.springTest.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * @author Andrey
 */
@Entity
@Table(name = "bank")
@Getter
@Setter
@ToString
public class Bank {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "name")
    private String name;


    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }
}
