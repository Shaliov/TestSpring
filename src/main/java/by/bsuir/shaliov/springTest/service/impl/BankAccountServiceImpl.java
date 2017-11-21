package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.BankAccount;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import by.bsuir.shaliov.springTest.repository.BankAccountRepository;
import by.bsuir.shaliov.springTest.service.BankAccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public class BankAccountServiceImpl implements BankAccountService{

    private static final Logger LOG = Logger.getLogger(BankAccountServiceImpl.class);

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Override
    public BankAccount add(BankAccount bankAccount) {
        BankAccount savedBankAccount = bankAccountRepository.saveAndFlush(bankAccount);
        LOG.info("add to database. Bank account id = " + savedBankAccount.getId());
        return savedBankAccount;
    }

    @Override
    public void delete(long id) {
        bankAccountRepository.delete(id);
        LOG.info("delete from database. Bank account id = " + id);

    }

    @Override
    public BankAccount edit(BankAccount bankAccount) {
        BankAccount editBankAccount = bankAccountRepository.saveAndFlush(bankAccount);
        LOG.info("edit from database. New bank account = " + editBankAccount.toString());
        return editBankAccount;
    }

    @Override
    public List<BankAccount> getAll() {
        LOG.info("get all from database");
        return bankAccountRepository.findAll();
    }
}
