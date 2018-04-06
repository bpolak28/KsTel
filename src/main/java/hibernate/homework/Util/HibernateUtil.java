package hibernate.homework.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public HibernateUtil(){

    }

    public Session getSession(){
        return sessionFactory.openSession();
    }

    public void closeSession(){
        sessionFactory.close();
    }
}
