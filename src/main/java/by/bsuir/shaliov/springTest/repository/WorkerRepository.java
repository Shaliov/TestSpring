package by.bsuir.shaliov.springTest.repository;

import by.bsuir.shaliov.springTest.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Andrey
 */
public interface WorkerRepository  extends JpaRepository<Worker, Long> {
}
