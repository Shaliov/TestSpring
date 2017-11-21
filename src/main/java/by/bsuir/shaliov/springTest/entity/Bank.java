package by.bsuir.shaliov.springTest.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "worker_id", nullable = false)
    private List<Worker> workerList;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id", nullable = false)
    private List<Client> clientList;

    public Bank() {
    }

    public Bank(String name, List<Worker> workerList, List<Client> clientList) {
        this.name = name;
        this.workerList = workerList;
        this.clientList = clientList;
    }
}
