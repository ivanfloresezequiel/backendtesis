package backend.DTO;

public class Response {
    private int estado;
    private String mensaje;
    private  Object data;

    public Response(){
        this.estado=0;
        this.mensaje="";
    }

    public void setEstado(int estado) {

        this.estado = estado;
    }

    public void setMensaje(String mensaje) {

        this.mensaje = mensaje;
    }

    public void setData(Object data) {

        this.data = data;
    }

    public int getEstado() {

        return estado;
    }

    public String getMensaje()
    {
        return mensaje;
    }

    public Object getData() {

        return data;
    }
}
