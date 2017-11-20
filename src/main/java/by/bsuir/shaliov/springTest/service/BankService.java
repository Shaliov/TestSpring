package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.Bank;

import java.util.List;

/**
 * @author Andrey
 */
public interface BankService {
    Bank add(Bank bank);
    void delete(long id);
    Bank getByName(String name);
    Bank edit(Bank bank);
    List<Bank> getAll();
}
