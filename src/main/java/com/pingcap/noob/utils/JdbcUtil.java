package com.pingcap.noob.utils;

import com.pingcap.noob.pojo.config.DataSourceConfig;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

    @Autowired
    DataSourceConfig dataSourceConfig;

    public static void runSqlFileByMyBatis(String driver, String url, String username, String password, String file) {
        Connection connection;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            ScriptRunner scriptRunner = new ScriptRunner(connection);
            scriptRunner.setLogWriter(null);
            scriptRunner.setErrorLogWriter(null);
            scriptRunner.setSendFullScript(true);
            scriptRunner.setAutoCommit(true);
            try {
                scriptRunner.runScript(Resources.getResourceAsReader("/sql/initData4TableUser.sql"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
