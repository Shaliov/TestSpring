package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.Worker;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import by.bsuir.shaliov.springTest.repository.WorkerRepository;
import by.bsuir.shaliov.springTest.service.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public class WorkerServiceImpl implements WorkerService {

    private static final Logger LOG = Logger.getLogger(WorkerServiceImpl.class);


    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public Worker add(Worker worker) {
        Worker savedWorker = workerRepository.saveAndFlush(worker);
        LOG.info("add to database. Worker id = " + savedWorker.getId());
        return savedWorker;
    }

    @Override
    public void delete(long id) {
        workerRepository.delete(id);
        LOG.info("delete from database. Bank account id = " + id);
    }

    @Override
    public Worker edit(Worker worker) {
        Worker editWorker = workerRepository.saveAndFlush(worker);
        LOG.info("edit from database. New worker = " + editWorker.toString());
        return editWorker;
    }

    @Override
    public List<Worker> getAll() {
        LOG.info("get all from database");
        return workerRepository.findAll();
    }
}
