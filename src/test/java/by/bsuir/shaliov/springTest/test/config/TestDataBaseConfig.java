package by.bsuir.shaliov.springTest.test.config;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author Andrey
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("by.bsuir.shaliov.springTest")
public class TestDataBaseConfig {
    private static final String PROP_DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String PROP_DATABASE_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String PROP_DATABASE_USERNAME = "root";
    private static final String PROP_DATABASE_PASSWORD = "1234asdqwe";

    private static final String PROP_HIBERNATE_DIALECT = "org.hibernate.dialect.MySQLDialect";
    private static final String PROP_HIBERNATE_SHOW_SQL = "true";
    private static final String PROP_ENTITYMANAGER_PACKAGES_TO_SCAN = "by.bsuir.shaliov.springTest.entity";
    private static final String PROP_HIBERNATE_HBM2DDL_AUTO = "create-drop";

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(PROP_DATABASE_DRIVER);
        dataSource.setUrl(PROP_DATABASE_URL);
        dataSource.setUsername(PROP_DATABASE_USERNAME);
        dataSource.setPassword(PROP_DATABASE_PASSWORD);

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistence.class);
        entityManagerFactoryBean.setPackagesToScan(PROP_ENTITYMANAGER_PACKAGES_TO_SCAN);

        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());

        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

        return transactionManager;
    }

    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect",	PROP_HIBERNATE_DIALECT);
        properties.put("hibernate.show_sql", PROP_HIBERNATE_SHOW_SQL);
        properties.put("hibernate.hbm2ddl.auto", PROP_HIBERNATE_HBM2DDL_AUTO);

        return properties;
    }
}
