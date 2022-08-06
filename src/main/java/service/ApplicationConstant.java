package service;

import java.sql.Connection;


public class ApplicationConstant {


    Connection connection = new DBHelper().connect();


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;

    }
}

