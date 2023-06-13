package funcionamiento;

public class Mensajes {
    private int idMensaje;
    private String mensaje;
    private String autorMensaje;
    private String fechaMensaje;

    //constructores

    public Mensajes(){

    }
    public Mensajes(int idMensaje, String mensaje, String autor){
        setIdMensaje(idMensaje);
        setMensaje(mensaje);
        setAutorMensaje(autor);
    }
    public Mensajes(int idMensaje,String mensaje, String autorMensaje,String fechaMensaje){
        setIdMensaje(idMensaje);
        setMensaje(mensaje);
        setAutorMensaje(autorMensaje);
        setFechaMensaje(fechaMensaje);

    }



    ///setters y getters
    public int getIdMensaje(){
        return idMensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    public void setAutorMensaje(String autor){
        this.autorMensaje=autor;
    }
    public void setIdMensaje(int id){
        this.idMensaje=id;
    }
    public void setFechaMensaje(String fecha){
        this.fechaMensaje=fecha;
    }
    public String getFechaMensaje(){
        return fechaMensaje;
    }
}
