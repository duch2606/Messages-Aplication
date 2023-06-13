package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conexion;
    ///constructor privado para no poder instanciar la clase
    private Conexion(){}

   public static Connection getInstance(){
        if(conexion==null){
            try{
                conexion=
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            }catch(SQLException e){
                System.out.println(e);
            }
        }
        return conexion;
    }



}
