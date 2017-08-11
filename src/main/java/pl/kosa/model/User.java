package pl.kosa.model;

import javax.persistence.*;

/**
 * Created by JF194405 on 07.08.2017.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_users;
    private String name;
    private String password;

    public User (String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getId_users() {
        return id_users;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getName () {
        return name;
    }

    public String getPassword () {
        return password;
    }
}
