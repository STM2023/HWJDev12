
package hwjdev12;

import hwjdev12.service.Client;
import hwjdev12.storage.Database;
import hwjdev12.storage.DatabaseInitService;
import hwjdev12.storage.hibernate.HibernateUtil;

import java.util.List;

import hwjdev12.service.ClientCrudService.ClientCrudService;
import hwjdev12.service.Planet;
import hwjdev12.service.PlanetCrudService.PlanetCrudService;
import org.hibernate.Session;

public class App {


    public static void main(String[] args) throws Exception {
        //task2
            Database database = Database.getInstance();

            new DatabaseInitService().initDb(database);

        //task3
            Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
            ClientCrudService clientCrudService = new ClientCrudService();

            // Створення нового Client
            Client newClient = new Client();
            newClient.setName("Joohn Doe");
            clientCrudService.saveClient(newClient);
            System.out.println("newClient= "+newClient);

            // Читаємо та виводимо Client по id
            Client client = clientCrudService.findClientById(1L);
            System.out.println("Found Client: " + client.getName());
            System.out.println("       Client= "+client);
            // Оновлюємо Client
            client.setName("Artur");
            clientCrudService.updateClient(client);
            System.out.println("update Client: " + client.getName());
            System.out.println("       Client= "+client);
            // Видаляємо Client
            System.out.println("delete Client: " + client.getName());
            clientCrudService.deleteClient(client);
            List<Client> clients = session.createQuery("from Client", Client.class).list();
            System.out.println("clients= "+clients);

            PlanetCrudService planetCrudService = new PlanetCrudService();
            //  Створення нової Planet
            Planet newPlanet = new Planet("VEN1","NEWPLANET1");
            planetCrudService.savePlanet(newPlanet);
            System.out.println("newPlanet= "+newPlanet);
            // Читаємо та виводимо Planet по id
            Planet planet = planetCrudService.findPlanetById("VEN1");
            System.out.println("Found Planet: " + planet.getName());
            System.out.println("       Planet= "+planet);

            // Видаляємо Planet
            System.out.println("delete Planet: " + planet.getName());
            planetCrudService.deletePlanet(planet);
            List<Planet> planets = session.createQuery("from Planet", Planet.class).list();
            System.out.println("planets= "+planets);
            session.close();

            HibernateUtil.getInstance().close();

    }


}