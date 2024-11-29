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
    
    for(int i=0;i< usuarios[0].length ;i++){// recorre el arreglo y buscar el usuario de busqueda para establecer la posicion del usuario
    if(usuarioBusqueda.equals(usuarios[0][i])){
    posicionUsuario = i;
    break;
    }
    }
    return posicionUsuario;
    }
    
    public static void validarUsuario( int posicionUsuario, String usuarioBusqueda){
    if(posicionUsuario>=0){//si la posicion no es -1, el usuario se encuentra en el arreglo
        JOptionPane.showMessageDialog(null, "Usuario encontrado");
                
        }
        else{//si el usuario es -1, no se encuentra en el arreglo
        JOptionPane.showMessageDialog(null,"Usuario no encontrado.");
                
        }

    
    }
    
    public static boolean validarPassword(String passwordBusqueda, int posicionUsuario, String[][] usuarios){
    boolean passwordValida;
    
    if(passwordBusqueda.equals(usuarios[1][posicionUsuario])){ //si la passwordd es igual a la posicion del arreglo de passwords(que es igual a la posicion del usuario en el primer arreglo
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
        if(posicionUsuario==-1){//si el usuario no se encuntra en el arreglo, se puede agregar
        JOptionPane.showMessageDialog(null,"Usuario valido");
        
    }
    else{
    JOptionPane.showMessageDialog(null, "Ese usuario ya se encuentra en uso");
    
    }
  
    }

    public static boolean validarPasswordNueva ( String passwordBusqueda){
    boolean passwordValida;
    passwordValida = (passwordBusqueda.length()==5) ? true: false;//valor ternario paar validar el numero de caracteres en la password
    
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
   
    String[][] usuariosconCreados = new String[usuarios.length][usuarios[0].length+1]; //se crea un nuevo arreglo con una posicion mas que el original
    String usuario="",password="";
    
    for(int i=0; i< usuarios.length;i++){ //se recorre el arreglo original para reemplazar esos valores en el nuevo
      for(int x=0; x<usuarios[i].length;x++){
        usuariosconCreados[i][x] = usuarios[i][x];
        
        }
    }
    
    usuario =usuariosconCreados[0][usuariosconCreados[0].length-1];//se establece el usuario como el ultimo agregado
    password = usuariosconCreados[1][usuariosconCreados[1].length-1];//se hace lo mismo con la password
    

    usuarios = usuariosconCreados;//se reemplazan los contenidos del usuario con los actualizados
    System.out.println("Usuario creado exitosamente!");
    }
   

}
