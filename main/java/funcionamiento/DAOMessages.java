package funcionamiento;

import conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

///Se encargara de conectarse a la base de datos y enviarle los datos
public class DAOMessages {
    public static void CrearMensajeDB(Mensajes mensaje) {
        ////Establecemos nuestra conexcion con nuestra base de datos
        Connection conexion = Conexion.getInstance();

        ///si nos logramos conectar exitosamente le mandamos el query a la db
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO mensajes(mensaje,autor_mensaje) VALUES (?,?);";
            ps = conexion.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutorMensaje());
            ps.executeUpdate();
            System.out.println("el mensaje fue creado");

        } catch (SQLException ex) {
            System.out.println(ex);

        }
    }

    public static void leerMensajes(){
        Connection conexion = Conexion.getInstance();
        ////nos enlazamos a nuestra base de datos y leemos los datos
        try{
            ///preparamos nuestro query
            String query = "Select * FROM mensajes;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            ///imprimos todos los resultados de nuestra consulta
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id_mensaje")+", Mensaje: "+rs.getString("mensaje"));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void borrarMensaje(int idMensaje){
        ///establecemos conexcion
        Connection conexion = Conexion.getInstance();
        try{
            String query = "DELETE FROM mensajes WHERE mensajes.id_mensaje=?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1,idMensaje);
            ps.executeUpdate();
            System.out.println("Mensaje borrado con exito");
            }catch (SQLException e){
                System.out.println(e);
            }


    }
    public static void actualizarMensajeDB(Mensajes mensaje){
        //establecemos conexion
        Connection conexion = Conexion.getInstance();
            try{
                String query = "UPDATE mensajes SET mensaje=? WHERE mensajes.id_mensaje=?";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setInt(2,mensaje.getIdMensaje());
                ps.executeUpdate();
                System.out.println("El mensaje fue editado con exito");
            }catch(SQLException e){
                System.out.println("Error al actualizar el mensaje");
            }

    }

}
