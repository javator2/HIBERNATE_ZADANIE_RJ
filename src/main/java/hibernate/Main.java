package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static final SessionFactory sessionFactory;

    static {
        try{
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        }
        catch (Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession(){
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {

        Session session = getSession();
        Transaction tx = session.getTransaction();
    }
}
