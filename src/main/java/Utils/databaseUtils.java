package Utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import commonFunctions.CommonFunctions;

public class databaseUtils {
    private static Logger log = LogManager.getLogger(databaseUtils.class.getName());
    
    public static Connection connectToDB(String dbType) throws SQLException, FileNotFoundException {
        String url = null;
        String env = CommonFunctions.getEnviornment();
        String dbName = getDbName(env, dbType);
        String masterUrl = "jdbc:mysql://shinsaiten-52test-server-rds.c0e0rghyz71r.ap-northeast-1.rds.amazonaws.com:3306/";
        String stageUrl = "jdbc:mysql://shinsaiten-test-only-rds.c0e0rghyz71r.ap-northeast-1.rds.amazonaws.com:3306/";
        String username = "readonly";
        String password = "ReaD0nly23";
        
        if(env.equals("MASTER")) {
            url = masterUrl + dbName;
        } else if(env.equals("STAGE")) {
            url = stageUrl + dbName;
        }
        
        Connection conn = DriverManager.getConnection(url,username,password);
        return conn;
    }
    
    public static ResultSet fetchData(Connection Conn, Statement stmt, String table, String column, String condition, String join, String orderBy) throws SQLException, IOException {
        String tableJoins = (join == null) ? "" : join;
        String orderByClause = (orderBy == null) ? "" : orderBy;
        String queryToExecute = "SELECT " + column 
                + " FROM " + table
                + " " + tableJoins
                + " WHERE " + condition
                + " " + orderByClause;
        log.info("SQL :" + queryToExecute);     
        ResultSet resultSet = stmt.executeQuery(queryToExecute);        
        return resultSet;
    }
    
    public static String getDbName(String env, String dbType) {
        String dbName = null;
        if (dbType.equals("automation")) {
            dbName = "osaka_automation";
        } else if (dbType.equals("application")) {
            if(env.equals("MASTER")) {
                dbName = "osaka_new";
            } else if(env.equals("STAGE")) {
                dbName = "osaka";
            }
        }
        log.info("Selected db name as " + dbName);
        return dbName;
    }
    
}
