package hwjdev12.service.PlanetCrudService;

import hwjdev12.service.Planet;
import hwjdev12.storage.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class PlanetDao {

    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
    // Create
    public void save(Planet planet) {
       try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
                session.persist(planet);
            tx.commit();

        }
    }

    // Read
    public Planet findById(String id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Planet.class, id);
        }
    }

    // Update
    public void update(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
                session.update(planet);
            tx.commit();

        }
    }

    // Delete
    public void delete(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
                session.delete(planet);
            tx.commit();

        }
    }
}

