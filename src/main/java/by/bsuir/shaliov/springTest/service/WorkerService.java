package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.Worker;

import java.util.List;

/**
 * @author Andrey
 */
public interface WorkerService {
    Worker add(Worker worker);
    void delete(long id);
    Worker edit(Worker worker);
    List<Worker> getAll();
}
