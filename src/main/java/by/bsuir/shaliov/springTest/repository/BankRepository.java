package by.bsuir.shaliov.springTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import by.bsuir.shaliov.springTest.entity.Bank;

/**
 * @author Andrey
 */
@Repository
public interface BankRepository extends JpaRepository<Bank, Long>{
    @Query("select b from Bank b where b.name = :name")
    Bank findByName(@Param("name") String name);
}
