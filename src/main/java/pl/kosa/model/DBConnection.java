package pl.kosa.model;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by JF194405 on 03.08.2017.
 */
public class DBConnection {
    private final static String DBURL = "jdbc:mysql://127.0.0.1:3306/login_server";
    private final static String DBUSER = "root";
    private final static String DBPASS = "admin";
    private final static String DBDRIVER = "com.mysql.cj.jdbc.Driver";

    private Connection connection;
    private Statement statement;

}
