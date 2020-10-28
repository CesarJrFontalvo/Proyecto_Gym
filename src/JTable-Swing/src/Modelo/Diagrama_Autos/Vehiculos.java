package Modelo.Diagrama_Autos;

import javax.swing.JOptionPane;

public class Vehiculos{

    public String Marca;
    public String Modelo;
    public String Color;
    public String Num_Motor;
    public String Num_Chasis;
    public void frenar(){
        JOptionPane.showConfirmDialog(null, "Esta Frenado..");
    }
    public void acelerar(){
        JOptionPane.showConfirmDialog(null, "Esta Acelerado..");
    }
    public void cruzar(){
        JOptionPane.showConfirmDialog(null, "Esta Cruzando..");
    }
    public void apagar(){
        JOptionPane.showConfirmDialog(null, "Esta Apagado..");
    }
    public String getMarca() {
            return Marca;
        }
    public void setMarca(String Marca) {
            this.Marca = Marca;
        }
    public String getModelo() {
            return Modelo;
        }
    public void setModelo(String Modelo) {
            this.Modelo = Modelo;
        }
    public String getColor() {
            return Color;
        }
    public void setColor(String Color) {
            this.Color = Color;
        }
    public String getNum_Motor() {
            return Num_Motor;
        }
    public void setNum_Motor(String Num_Motor) {
            this.Num_Motor = Num_Motor;
        }
    public String getNum_Chasis() {
            return Num_Chasis;
        }
    public void setNum_Chasis(String Num_Chasis) {
            this.Num_Chasis = Num_Chasis;
        }
}
