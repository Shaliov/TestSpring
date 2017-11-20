package by.bsuir.shaliov.springTest.service;

import by.bsuir.shaliov.springTest.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrey
 */
@Service
public interface ClientService {
    Client add(Client client);
    void delete(Long id);
    Client getByName(String name);
    Client edit(Client client);
    List<Client> getAll();
}
