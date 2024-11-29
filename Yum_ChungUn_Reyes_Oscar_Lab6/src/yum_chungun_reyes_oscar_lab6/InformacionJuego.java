/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yum_chungun_reyes_oscar_lab6;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InformacionJuego {
    String BotonText; 
    int turno = 1; 
    JLabel[][] Labels = new JLabel[3][3];
         
    
    void Turnos () {
        System.out.println("Turno de: " + turno);
        if (turno == 1) {
            BotonText = "X";
            turno = 2;
        } else if (turno == 2 ) {BotonText = "O"; turno = 1;}
    
    }
    
    void setTextoBoton (int fila, int col) {
        if ("".equals(Labels[fila-1][col-1].getText())){
            Turnos();
            Labels[fila-1][col-1].setText(BotonText);
            Labels[fila-1][col-1].setForeground(Color.WHITE);
        } else {JOptionPane.showMessageDialog(null, "Esta ocupado");}
        

    }
    
   
}
