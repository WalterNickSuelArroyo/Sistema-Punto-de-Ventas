package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {

    private String db = "punto_de_ventas";
    private String user = "root";
    private String password = "1234";
    private String urlMysql = "jdbc:mysql://localhost/" + db + "?SslMode=none";
    private Connection conn = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.urlMysql,this.user,this.password);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: "+e);
        }
    }
}
