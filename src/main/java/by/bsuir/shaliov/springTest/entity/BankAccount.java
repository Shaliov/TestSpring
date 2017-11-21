package by.bsuir.shaliov.springTest.entity;

import by.bsuir.shaliov.springTest.entity.enums.Currency;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;

    @Column(name = "amount_of_credit")
    private double amountOfCredit;

    public BankAccount() {
    }

    public BankAccount(Currency currency, double amountOfCredit) {
        this.currency = currency;
        this.amountOfCredit = amountOfCredit;
    }
}