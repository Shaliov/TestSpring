package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.Bank;
import by.bsuir.shaliov.springTest.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import by.bsuir.shaliov.springTest.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank add(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);
    }

    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

    @Override
    public Bank edit(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}
