package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.Worker;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public interface WorkerService {
    Worker add(Worker worker);
    void delete(Long id);
    Worker edit(Worker worker);
    List<Worker> getAll();
}
