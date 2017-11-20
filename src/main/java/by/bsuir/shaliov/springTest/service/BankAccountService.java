package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.BankAccount;

import java.util.List;

/**
 * @author Andrey
 */
public interface BankAccountService {
    BankAccount add(BankAccount bankAccount);
    void delete(long id);
    BankAccount edit(BankAccount bankAccount);
    List<BankAccount> getAll();
}
