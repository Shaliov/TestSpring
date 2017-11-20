package by.bsuir.shaliov.springTest.entity;

import by.bsuir.shaliov.springTest.entity.enums.WorkerStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
/**
 * @author Andrey
 */
@Entity
@Table(name = "worker")
@Getter
@Setter
@ToString
public class Worker {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private WorkerStatus status;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

    public Worker() {
    }

    public Worker(String firstName, String lastName, WorkerStatus status, String phoneNumber, Bank bank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.phoneNumber = phoneNumber;
        this.bank = bank;
    }
}
