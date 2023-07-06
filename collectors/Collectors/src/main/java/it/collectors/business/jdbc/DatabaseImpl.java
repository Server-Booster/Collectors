package it.collectors.business.jdbc;

import java.sql.Connection;

public class DatabaseImpl {

    //private static final String DB_NAME = "collectors";

    private static final String CONNECTION_STRING = "";

    private static final String DB_USER = "admin";

    private static final String DB_PASSWORD = "admin";

    private Connect_JDBC connect = new Connect_JDBC(CONNECTION_STRING, DB_USER, DB_PASSWORD);

    private Query_JDBC queryJdbc;

    public DatabaseImpl() {
        try {
            queryJdbc = new Query_JDBC(connect.getConnection());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Query_JDBC getImplementation() {
        return queryJdbc;
    }



}
