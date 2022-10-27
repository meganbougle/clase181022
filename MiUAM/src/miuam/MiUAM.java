/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miuam;

import dao.Usuario;
import formularios.Login;
import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class MiUAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Usuario usuarios = new Usuario();
       usuarios.agregar("19014616", "1234", "Megan", "Bougle", "Meg.pockets@gmail.com");
        usuarios.agregar("1901717", "12345", "Silvio", "Vigil", "Silverpockets@gmail.com");
        
        Login login = new Login();
        login.usuarios = usuarios;
        login.setVisible(true);
       
    }
    
    public void llenarUsuaios(){
        
         Usuario usuarios = new Usuario();
       usuarios.agregar("19014616", "1234", "Megan", "Bougle", "Meg.pockets@gmail.com");
        usuarios.agregar("1901717", "12345", "Silvio", "Vigil", "Silverpockets@gmail.com");
        
        Login login = new Login();
        login.usuarios = usuarios;
        System.out.println("En main");
        login.setVisible(true);
        
    }
                            
    
}
