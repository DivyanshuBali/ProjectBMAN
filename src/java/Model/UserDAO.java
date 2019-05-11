/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Divyanshu Bali
 */
public class UserDAO {

    public boolean check(User original) {
        Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        User user = null;
        
        try {
            cf = new Configuration();
            cf.configure();

            sf = cf.buildSessionFactory();
            session = sf.openSession();

            Transaction tx = session.beginTransaction();
            
            user = (User) session.get(User.class, original.getUsername());
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            session.close();
            sf.close();
        }
        if(user == null) {
            return false;
        } else {
            return user.equals(original);
        }
    }
}
