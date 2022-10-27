/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;


/**
 *
 * @author labc205
 */
public class Usuario {
  private ArrayList<modelos.Usuario> lista 
          = new ArrayList<>();  

    public Usuario() {
    }

    public ArrayList<modelos.Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<modelos.Usuario> lista) {
        this.lista = lista;
    }
  
  public void agregar(String user, String pw, String nombres, String apellidos, String email){
      this.lista.add(new modelos.Usuario(user,pw,nombres,apellidos,email));
  }
  public void editar(String user, String pw, String nombres, String apellidos, String email){
     for(modelos.Usuario usuario : this.lista){
       if(usuario.existe(user))
       {
           usuario.setPw(pw);
           usuario.setNombres(nombres);
           usuario.setApellido(apellidos);
           usuario.setEnail(email);
       }
     }
  }
  
  public boolean autenticarUsuario(String user, String pw){
      for(modelos.Usuario us: this.lista){
          if(us.verificarUser(user, pw))
              return true;
      }
      return false;
  }
}
