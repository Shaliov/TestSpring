package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.Bank;
import by.bsuir.shaliov.springTest.entity.BankAccount;
import by.bsuir.shaliov.springTest.repository.BankRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import by.bsuir.shaliov.springTest.service.BankService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public class BankServiceImpl implements BankService {

    private static final Logger LOG = Logger.getLogger(BankServiceImpl.class);


    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank add(Bank bank) {
        Bank savedBank = bankRepository.saveAndFlush(bank);
        LOG.info("add to database. Bank id = " + savedBank.getId());
        return savedBank;
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);
        LOG.info("delete from database. Bank id = " + id);
    }

    @Override
    public Bank getByName(String name) {
        LOG.info("find by name = " + name);
        Bank bank = bankRepository.findByName(name);
        if (bank == null) {
            LOG.info("bank with this name is not found");
        }
        return bankRepository.findByName(name);
    }

    @Override
    public Bank edit(Bank bank) {
        Bank editBank = bankRepository.saveAndFlush(bank);
        LOG.info("edit from database. New bank = " + editBank.toString());
        return editBank;
    }

    @Override
    public List<Bank> getAll() {
        LOG.info("get all from database");
        return bankRepository.findAll();
    }
}
