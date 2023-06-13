package testers;
import funcionamiento.*;
import conexion.Conexion;
import java.sql.Connection;
import java.util.Scanner;
import java.util.Calendar;

public class Inicio{
    public static void printMenu(){
        Calendar dat1 = Calendar.getInstance();
        System.out.print(dat1.getTime());
        System.out.println("---------------------------");
        System.out.println("Aplicacion de mensajes");
        System.out.println("[1] Crear mensaje");
        System.out.println("[2] Listar mensaje");
        System.out.println("[3] Editar mensaje");
        System.out.println("[4] Eliminar mensaje");
        System.out.println("[5] Salir");
    }
    public static void main(String[] args) {
        int opcion;
        ///hacemos un menu
        do{
            Scanner scan = new Scanner(System.in);
            printMenu();
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    serviciosMensaje.crearMensaje();
                    break;
                case 2:
                    serviciosMensaje.listarMensajes();
                    break;
                case 3:
                    serviciosMensaje.actualizarMensaje();
                    break;
                case 4:
                    serviciosMensaje.borrarMensaje();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }while(opcion!=5);



    }
}