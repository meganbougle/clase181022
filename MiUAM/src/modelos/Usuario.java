/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author labc205
 */
public class Usuario {
   private String userName;
   private String pw;
   private String nombres;
   private String apellido;
   private String enail;

    public Usuario() {
    }

    public Usuario(String userName, String pw, String nombres, String apellido, String enail) {
        this.userName = userName;
        this.pw = pw;
        this.nombres = nombres;
        this.apellido = apellido;
        this.enail = enail;
    }

    public String getEnail() {
        return enail;
    }

    public void setEnail(String enail) {
        this.enail = enail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
   public boolean verificarUser(String user, String pw){
       return this.userName.equals(user)&& this.pw.equals(pw);
   }
}
