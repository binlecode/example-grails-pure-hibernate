package hibernate

import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 6/14/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
class HibernateUtil {
    static final SessionFactory sessionFactory

    static {
        sessionFactory = new Configuration().configure('hibernate.cfg.xml').buildSessionFactory()
    }

    static void shutDown() {
        sessionFactory.close()
    }
}
