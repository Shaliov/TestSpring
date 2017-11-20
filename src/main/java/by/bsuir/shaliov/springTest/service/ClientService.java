package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.Client;

import java.util.List;

/**
 * @author Andrey
 */
public interface ClientService {
    Client add(Client client);
    void delete(long id);
    Client getByName(String name);
    Client edit(Client client);
    List<Client> getAll();
}
