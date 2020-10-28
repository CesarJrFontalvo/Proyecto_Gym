/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Diagrama_Empresa;

import javax.swing.JTable;
import javax.swing.JTextField;

public class Empleados {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + getNombre() + '}';
    }
     
    public void ingresar(JTextField usuario, JTextField contrasena){ }
    public void ingresar(JTextField usuario){ }
    public void ingresar(JTable usuario){ }
    public void ingresar(){ }
    
    
}
