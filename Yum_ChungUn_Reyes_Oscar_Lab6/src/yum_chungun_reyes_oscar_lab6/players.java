/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yum_chungun_reyes_oscar_lab6;

/**
 *
 * @author chung
 */
public class players {
    String usuario,password;
    String[][] usuarios = {{"chungun23","oscar","pato"},{"mcr10","pop12","patos"}};

    public String[][] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String[][] usuarios) {
        this.usuarios = usuarios;
    }
    String partidas[];
    int puntos= 0;
    int partidasJugadas;
    
   public players (String usuario, String password){
    this.usuario = usuario;
    this.password = password;
    partidasJugadas = 0;
    
    partidas = new String[100];
    }
   
    void registrarPartida (String partidaActual){
    partidas[partidasJugadas] = partidaActual;
    partidasJugadas++;
    }
   
    String mostrarPartidas(){
    String todasPartidas="";
     
    for(int i=0;i<partidasJugadas;i++){
     todasPartidas+= partidas[i] + "\n";
    }
    
    return todasPartidas;
    }
}
