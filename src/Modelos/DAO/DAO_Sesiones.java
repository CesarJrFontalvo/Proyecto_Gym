
package Modelos.DAO;

/**
 *
 * @author Hp g4
 */
public class DAO_Sesiones {

public int Identificacion;
public int IdentificacionEmplaedo;
public int IdentificacionUsuario;
public String Fecha_Inicio;
public String Hora_Inicio;
public String Fecha_Fin;
public String Hora_Fin;
public String Descripcion;

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public int getIdentificacionEmplaedo() {
        return IdentificacionEmplaedo;
    }

    public void setIdentificacionEmplaedo(int IdentificacionEmplaedo) {
        this.IdentificacionEmplaedo = IdentificacionEmplaedo;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int IdentificacionUsuario) {
        this.IdentificacionUsuario = IdentificacionUsuario;
    }

    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(String Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public String getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(String Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    public String getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(String Fecha_Fin) {
        this.Fecha_Fin = Fecha_Fin;
    }

    public String getHora_Fin() {
        return Hora_Fin;
    }

    public void setHora_Fin(String Hora_Fin) {
        this.Hora_Fin = Hora_Fin;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    

}
