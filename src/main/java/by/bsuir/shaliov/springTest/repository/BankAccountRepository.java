package by.bsuir.shaliov.springTest.repository;

import by.bsuir.shaliov.springTest.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Andrey
 */
public interface BankAccountRepository  extends JpaRepository<BankAccount, Long> {
}
