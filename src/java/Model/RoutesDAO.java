/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static jdk.nashorn.internal.objects.NativeError.printStackTrace;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Divyanshu Bali
 */
public class RoutesDAO {

    public void SetRoutes(Routes original) {
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;

        try {
            cf = new Configuration();
            cf.configure();

            sf = cf.buildSessionFactory();
            session = sf.openSession();

            Transaction tx = session.beginTransaction();

            session.save(original);
            tx.commit();

        } catch (Exception e) {
            printStackTrace(e);
        } finally {
            session.close();
            sf.close();
        }
    }

    public void NewRoutes(Routes original) {
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;

        try {
            cf = new Configuration();
            cf.configure();

            sf = cf.buildSessionFactory();
            session = sf.openSession();

            Transaction tx = session.beginTransaction();

            session.update(original);
            tx.commit();

        } catch (Exception e) {
            printStackTrace(e);
        } finally {
            session.close();
            sf.close();
        }
    }
}
