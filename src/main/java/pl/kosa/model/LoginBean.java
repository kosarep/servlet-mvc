package pl.kosa.model;

/**
 * Created by JF194405 on 02.08.2017.
 */
public class LoginBean {
    private String name;
    private String password;

    public LoginBean (String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean validate() {
        if (password.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}
