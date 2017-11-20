package by.bsuir.shaliov.springTest.repository;

import by.bsuir.shaliov.springTest.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Andrey
 */
@Repository
public interface WorkerRepository  extends JpaRepository<Worker, Long> {
}
