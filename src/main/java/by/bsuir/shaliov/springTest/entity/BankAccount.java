package by.bsuir.shaliov.springTest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Andrey
 */
@Entity
@Table(name = "bank_account")
@Getter
@Setter
@ToString
public class BankAccount {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "currency")
    private double currency;

    @Column(name = "amount")
    private double amount;

    @Column(name = "amount_of_credit")
    private double amountOfCredit;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public BankAccount() {
    }

    public BankAccount(double currency, double amount, double amountOfCredit, Client client) {
        this.currency = currency;
        this.amount = amount;
        this.amountOfCredit = amountOfCredit;
        this.client = client;
    }
}