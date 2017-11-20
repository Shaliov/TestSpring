package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import by.bsuir.shaliov.springTest.repository.WorkerRepository;
import by.bsuir.shaliov.springTest.service.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public Worker add(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public void delete(Long id) {
        workerRepository.delete(id);
    }

    @Override
    public Worker edit(Worker worker) {
        return workerRepository.saveAndFlush(worker);
    }

    @Override
    public List<Worker> getAll() {
        return workerRepository.findAll();
    }
}
