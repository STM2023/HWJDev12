package hwjdev12.service.ClientCrudService;


import hwjdev12.service.Client;

public class ClientCrudService {
    private ClientDao clientDao = new ClientDao();
       public void saveClient(Client client) {
           clientDao.save(client);
    }

    public Client findClientById(Long id) {
        return clientDao.findById(id);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void deleteClient(Client client) {
        clientDao.delete(client);
    }
}