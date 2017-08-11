package pl.kosa.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JF194405 on 03.08.2017.
 */
public class DBConnection {
    private final  static String PERSISTENCE_UNIT_NAME = "User";
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    private EntityManager em = emf.createEntityManager();

    public EntityManager getEm () {
        return em;
    }

}
