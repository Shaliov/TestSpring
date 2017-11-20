package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.Bank;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public interface BankService {
    Bank add(Bank bank);
    void delete(Long id);
    Bank getByName(String name);
    Bank edit(Bank bank);
    List<Bank> getAll();
}
