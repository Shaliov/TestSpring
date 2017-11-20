package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public interface BankAccountService {
    BankAccount add(BankAccount bankAccount);
    void delete(Long id);
    BankAccount edit(BankAccount bankAccount);
    List<BankAccount> getAll();
}
