package Modelo.Diagrama_Autos;

import javax.swing.JOptionPane;

public class Prueba_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mercedes obj = new Mercedes();
        Mercedes_Benz obj3= new Mercedes_Benz();
        
        obj3.pitar();
        obj.acelerar();
        obj.frenar();
        obj.cruzar();
        obj.setColor("Azul");
        JOptionPane.showConfirmDialog(null,"El Color cambio a: "+obj.getColor());
        obj.apagar();
    }
    
}
