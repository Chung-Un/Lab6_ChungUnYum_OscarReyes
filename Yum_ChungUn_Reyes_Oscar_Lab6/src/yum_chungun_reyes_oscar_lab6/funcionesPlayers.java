/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yum_chungun_reyes_oscar_lab6;

import javax.swing.JOptionPane;

/**
 *
 * @author chung
 */
public class funcionesPlayers {
   
    
   
    public static int validarPosicion(String usuarioBusqueda,String[][] usuarios ){
    int posicionUsuario=-1;
    
    for(int i=0;i< usuarios[0].length ;i++){
    if(usuarioBusqueda.equals(usuarios[0][i])){
    posicionUsuario = i;
    break;
    }
    }
    return posicionUsuario;
    }
    
    public static void validarUsuario( int posicionUsuario, String usuarioBusqueda){
    if(posicionUsuario>=0){
        JOptionPane.showMessageDialog(null, "Usuario encontrado");
                
        }
        else{
        JOptionPane.showMessageDialog(null,"Usuario no encontrado.");
                
        }

    
    }
    
    public static boolean validarPassword(String passwordBusqueda, int posicionUsuario, String[][] usuarios){
    boolean passwordValida;
    
    if(passwordBusqueda.equals(usuarios[1][posicionUsuario])){
                JOptionPane.showMessageDialog(null,"Bienvenido " + usuarios[0][posicionUsuario]);
                passwordValida = true;
                return passwordValida;
                }
                else{
                JOptionPane.showMessageDialog(null,"Password incorrecta");
                passwordValida = false;
                return passwordValida;
    
    }}
 
    public static void validarUsuarioNuevo(int posicionUsuario, String usuarioBusqueda){
        if(posicionUsuario==-1){
        JOptionPane.showMessageDialog(null,"Usuario valido");
        
    }
    else{
    JOptionPane.showMessageDialog(null, "Ese usuario ya se encuentra en uso");
    
    }
  
    }

    public static boolean validarPasswordNueva ( String passwordBusqueda){
    boolean passwordValida;
    passwordValida = (passwordBusqueda.length()==5) ? true: false;
    
    if(passwordValida){
    JOptionPane.showMessageDialog(null, "Password valida.");
    passwordValida = true;
    return passwordValida;
    
    }
    else{
    JOptionPane.showMessageDialog(null,"Esa password no cumple con el requisito de 5 caracteres");
    passwordValida =false;
    return passwordValida;
    }   
    
    }
    
    public static void crearPlayer(String[][] usuarios, int[] puntos){
   
    String[][] usuariosconCreados = new String[usuarios.length][usuarios[0].length+1];
    String usuario="",password="";
    
    for(int i=0; i< usuarios.length;i++){
      for(int x=0; x<usuarios[i].length;x++){
        usuariosconCreados[i][x] = usuarios[i][x];
        
        }
    }
    
    usuario =usuariosconCreados[0][usuariosconCreados[0].length-1];
    password = usuariosconCreados[1][usuariosconCreados[1].length-1];
    

    usuarios = usuariosconCreados;
    System.out.println("Usuario creado exitosamente!");
    }
   
//    public static String mostrarRanking(players player){
//        String ranking="";
//        int temp;
//    
//        for(int x=0;x<10;x++){
//        for (int y=1;y<10;y++){
//        if(player.getUsuarios()[y-1] >= player.getUsuarios()[y]){
//        temp = a[y];
//        a[y]=a[y-1];
//        a[y-1] = temp;
//    }
//        }
//    }
//
//
//
//        return ranking;
//        }
    
    
}
