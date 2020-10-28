/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.DAO;

import Modelos.Empleados;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp g4
 */
public class DAO_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        // TODO code application logic here
        
//        Scanner Lectura= new Scanner(System.in);
        DAO_Usuario Usuario=new DAO_Usuario();
        
        String Nombre= JOptionPane.showInputDialog(null, "Digite su Nombre");
        Usuario.setNombre(Nombre);
        
        String Apellidos= JOptionPane.showInputDialog(null, "Digite sus Apellidos");
        Usuario.setApellido(Apellidos);
        
        JOptionPane.showMessageDialog(null,"Su nombre completo es: " +Usuario.getNombre()+" "+Usuario.getApellido());
        
        
        
    }
     
       
    
    
    }
