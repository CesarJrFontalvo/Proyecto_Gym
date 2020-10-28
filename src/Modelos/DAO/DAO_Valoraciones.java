
package Modelos.DAO;

/**
 *
 * @author Hp g4
 */
public class DAO_Valoraciones {

public int Identificacion;    
public String Denominacion;
public String Registro_medico;
public int IdentificacionUsuario;

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
    }

    public String getRegistro_medico() {
        return Registro_medico;
    }

    public void setRegistro_medico(String Registro_medico) {
        this.Registro_medico = Registro_medico;
    }

    public int getIdentificacionUsuario() {
        return IdentificacionUsuario;
    }

    public void setIdentificacionUsuario(int IdentificacionUsuario) {
        this.IdentificacionUsuario = IdentificacionUsuario;
    }


}
