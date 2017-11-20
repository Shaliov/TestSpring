package by.bsuir.shaliov.springTest.repository;

import by.bsuir.shaliov.springTest.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author Andrey
 */
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("select c from Client c where c.firstName = :name")
    Client findByFirstName(@Param("name") String name);
}
