package by.bsuir.shaliov.springTest.test.util;

import by.bsuir.shaliov.springTest.entity.Bank;

/**
 * @author Andrey
 */
public class BankUtil {

    public static Bank createBank(String name){
        Bank bank = new Bank();
        bank.setName(name);
        return bank;
    }
}
