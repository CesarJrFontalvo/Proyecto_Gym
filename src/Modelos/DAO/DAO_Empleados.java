
package Modelos.DAO;

/**
 *
 * @author Hp g4
 */
public class DAO_Empleados {

public int identificacion;
    public String Nombre;
    public String Apellido;
    public String Direccion;
    public String Telefono;//Definir parametrización
    public String Correo;
    public String Contraseña;
    public String Fecha_Nacimiento;//Definir parametrización
    public int identificacionRol;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public int getIdentificacionRol() {
        return identificacionRol;
    }

    public void setIdentificacionRol(int identificacionRol) {
        this.identificacionRol = identificacionRol;
    }
    
    
}
