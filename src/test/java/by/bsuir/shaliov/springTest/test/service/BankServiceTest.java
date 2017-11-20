package by.bsuir.shaliov.springTest.test.service;

import by.bsuir.shaliov.springTest.entity.Bank;
import by.bsuir.shaliov.springTest.service.BankService;
import by.bsuir.shaliov.springTest.test.config.TestDataBaseConfig;
import by.bsuir.shaliov.springTest.test.util.BankUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * @author Andrey
 */
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class BankServiceTest {

    @Resource
    private EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;

    @Resource
    private BankService bankService;

    @Before
    public void setUp() {
        entityManager = entityManagerFactory.createEntityManager(); }


    @Test
    public void setSaveBank() {
        bankService.add(BankUtil.createBank("Gold Bank"));
    }



}
