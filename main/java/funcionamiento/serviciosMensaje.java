package funcionamiento;

import java.io.DataOutput;
import java.util.Scanner;

///Esta clase sera la encargada de pedirnos los datos de lo que vayamos a hacer para
///posteriormente mandarlo a nuestra clase DAO
public class serviciosMensaje {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Ingresa el autor");
        String autorNombre = sc.nextLine();
        Mensajes registro = new Mensajes(3,mensaje,autorNombre);
        DAOMessages.CrearMensajeDB(registro);
    }

    public static void listarMensajes(){
        DAOMessages.leerMensajes();
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el id del mensaje que quieras borrar: ");
        int id = sc.nextInt();
        DAOMessages.borrarMensaje(id);
    }
    public static void actualizarMensaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nuevo mensaje: ");
        String mensajeEditado=sc.nextLine();

        System.out.println("Ingresa el id del mensaje a editar");
        int idMensaje = sc.nextInt();

        Mensajes mensajeActualizado = new Mensajes(idMensaje,mensajeEditado,"Ducho");
        DAOMessages.actualizarMensajeDB(mensajeActualizado);
    }
}
