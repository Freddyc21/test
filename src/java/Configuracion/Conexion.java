package Configuracion;

import java.sql.*;

public class Conexion {
    Connection con;
    // Metodo Constructor para el inicio de la conexion
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectopqrs","root","");
        } catch (ClassNotFoundException | SQLException e){
            System.err.println("Error en Conexion"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    
}
