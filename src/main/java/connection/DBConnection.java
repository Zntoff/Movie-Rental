
package connection;

import java.sql.Connection;
import java.sql.DriverManager;




public class DBConnection {
    Connection connection;
    static String db = "movies_rental";
    static String port = "3306";
    static String login = "root";
    static String password = "admin";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:"+ this.port + "/" + this.db;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
        }   System.out.println("No se pudo");
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void desconectar(){
    connection = null;
     }
}
