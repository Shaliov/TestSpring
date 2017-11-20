package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import by.bsuir.shaliov.springTest.repository.BankAccountRepository;
import by.bsuir.shaliov.springTest.service.BankAccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
public class BankAccountServiceImpl implements BankAccountService{

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Override
    public BankAccount add(BankAccount bankAccount) {
        return bankAccountRepository.saveAndFlush(bankAccount);
    }

    @Override
    public void delete(Long id) {
        bankAccountRepository.delete(id);
    }

    @Override
    public BankAccount edit(BankAccount bankAccount) {
        return bankAccountRepository.saveAndFlush(bankAccount);
    }

    @Override
    public List<BankAccount> getAll() {
        return bankAccountRepository.findAll();
    }
}
