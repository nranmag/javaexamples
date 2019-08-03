package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectToDB {

    Connection miConexion;
    PreparedStatement consulta;
    ResultSet datos;
    
    public Connection getConnection(String BD, String usuario, String contraseña) throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/" + BD;
            
            miConexion = DriverManager.getConnection(servidor, usuario, contraseña);
        }catch(ClassNotFoundException e){
            System.err.println("No se encontró Driver");
            miConexion = null;
        }catch(SQLException ex){
            System.err.println("No se pudo conectar a la base de datos");
        }
        
        return miConexion;
    }
    
    public void consulta(){
        try {
            miConexion = (Connection) this.getConnection("prueba","root","");
            consulta = miConexion.prepareStatement("SELECT id,nombre FROM prueba.usuario");
            datos = consulta.executeQuery();
            
            while(datos.next()){
                System.out.println("User = " + datos.getString("id") + "\n"
                + "Nombre = " + datos.getString("nombre"));
            }
            
        } catch (SQLException e) {
            System.err.println("No se pudo conectar o hacer consulta");
        } finally{
            this.desconectar();
        }
    }
    
    public void desconectar(){
        try {
            miConexion.close();
            consulta.close();
            datos = null;
        } catch (Exception e) {
            System.err.println("");
        }
    }
}
