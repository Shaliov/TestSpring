package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.Client;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import by.bsuir.shaliov.springTest.repository.ClientRepository;
import by.bsuir.shaliov.springTest.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public class ClientServiceImpl implements ClientService{

    private static final Logger LOG = Logger.getLogger(ClientServiceImpl.class);


    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client add(Client client) {
        Client savedClient = clientRepository.saveAndFlush(client);
        LOG.info("add to database. Client id = " + savedClient.getId());
        return savedClient;
    }

    @Override
    public void delete(long id) {
        clientRepository.delete(id);
        LOG.info("delete from database. Client id = " + id);
    }

    @Override
    public Client getByName(String name) {
        LOG.info("find by name = " + name);
        Client client = clientRepository.findByFirstName(name);
        if (client == null) {
            LOG.info("client with this name is not found");
        }
        return client;
    }

    @Override
    public Client edit(Client client) {
        Client editClient = clientRepository.saveAndFlush(client);
        LOG.info("edit from database. New client = " + editClient.toString());
        return editClient;
    }

    @Override
    public List<Client> getAll() {
        LOG.info("get all from database");
        return clientRepository.findAll();
    }
}
