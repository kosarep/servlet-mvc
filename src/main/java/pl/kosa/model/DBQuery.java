package pl.kosa.model;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by JF194405 on 08.08.2017.
 */
public class DBQuery {
    private EntityManager em;
    private User user;

    public DBQuery (User user) {
        this.em = new DBConnection().getEm();
        this.user = user;
    }

    public boolean validatePassword() {
        Query query = em.createQuery("select u.password from User u where u.name = :uName").setParameter("uName", user.getName());
        List passList = query.getResultList();

        if (passList.size() != 0 && user.getPassword().equals(passList.get(0).toString())) {
            return true;
        } else {
            return false;
        }
    }

}
