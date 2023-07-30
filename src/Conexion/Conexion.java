package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {

    private String db = "punto_de_venta";
    private String user = "root";
    private String password = "";
    private String urlMysql = "jdbc:mysql://localhost/" + db + "?SslMode=none";
    private Connection conn = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.urlMysql,this.user,this.password);
            if (conn != null) {
                System.out.println("Conexion a la base de datos "+this.db+"...Listo ");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
    }

    public Connection getConn() {
        return conn;
    }
    
}
