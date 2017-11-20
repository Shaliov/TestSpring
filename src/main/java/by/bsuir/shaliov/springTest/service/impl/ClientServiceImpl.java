package by.bsuir.shaliov.springTest.service.impl;

import by.bsuir.shaliov.springTest.entity.Client;
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

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client add(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public void delete(long id) {
        clientRepository.delete(id);
    }

    @Override
    public Client getByName(String name) {
        return clientRepository.findByFirstName(name);
    }

    @Override
    public Client edit(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
