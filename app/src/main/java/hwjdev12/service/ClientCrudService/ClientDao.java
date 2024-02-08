package hwjdev12.service.ClientCrudService;
import hwjdev12.service.Client;
import hwjdev12.storage.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {

  private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
        // Create
        public void save(Client сlient) {
            try (Session session = sessionFactory.openSession()) {
                Transaction tx = session.beginTransaction();
                   session.save(сlient);
                tx.commit();
            }
        }
        // Read
        public Client findById(Long id) {
            try (Session session = sessionFactory.openSession()) {
                return session.get(Client.class, id);
            }
        }
        // Update
        public void update(Client сlient) {
            try (Session session = sessionFactory.openSession()) {
                Transaction tx = session.beginTransaction();
                    session.update(сlient);
                tx.commit();
            }
        }
        // Delete
        public void delete(Client сlient) {
            try (Session session = sessionFactory.openSession()) {
                Transaction tx = session.beginTransaction();
                    session.delete(сlient);
                tx.commit();
            }
        }
    }

