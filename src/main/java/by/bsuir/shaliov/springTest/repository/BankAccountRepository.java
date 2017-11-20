package by.bsuir.shaliov.springTest.repository;

import by.bsuir.shaliov.springTest.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Andrey
 */
@Repository
public interface BankAccountRepository  extends JpaRepository<BankAccount, Long> {
}
