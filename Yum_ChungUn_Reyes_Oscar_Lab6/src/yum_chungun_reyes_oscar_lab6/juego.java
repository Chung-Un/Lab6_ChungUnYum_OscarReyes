/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yum_chungun_reyes_oscar_lab6;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Juego extends javax.swing.JFrame {
    
    public InformacionJuego I = new InformacionJuego();
    
    public Juego() {
        initComponents();
        
    }

   
    
    /*void IniciarLabels(){
        I.Labels[0][0] = Posicion1;
        I.Labels[0][1] = Posicion2;
        I.Labels[0][2] = Posicion3;
        I.Labels[1][0] = Posicion4;
        I.Labels[1][1] = Posicion5;
        I.Labels[1][2] = Posicion6;
        I.Labels[2][0] = Posicion7;
        I.Labels[2][1] = Posicion8;
        I.Labels[2][2] = Posicion9;
      
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Posicion1 = new javax.swing.JLabel();
        Posicion2 = new javax.swing.JLabel();
        Posicion3 = new javax.swing.JLabel();
        Posicion4 = new javax.swing.JLabel();
        Posicion5 = new javax.swing.JLabel();
        Posicion6 = new javax.swing.JLabel();
        Posicion8 = new javax.swing.JLabel();
        Posicion9 = new javax.swing.JLabel();
        Posicion7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MostrarTurno = new javax.swing.JLabel();
        Labelp = new javax.swing.JLabel();
        EstablecerBoton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        Posicion1.setBackground(new java.awt.Color(0, 153, 255));
        Posicion1.setForeground(new java.awt.Color(255, 255, 255));
        Posicion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion2.setForeground(new java.awt.Color(255, 255, 255));
        Posicion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion4.setBackground(new java.awt.Color(0, 153, 255));
        Posicion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Posicion7.setBackground(new java.awt.Color(0, 153, 255));
        Posicion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Posicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Posicion2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Posicion3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Posicion4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Posicion5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Posicion6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Posicion7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Posicion8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Posicion9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Posicion2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Posicion5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Posicion8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Turno:");

        MostrarTurno.setText("..");

        Labelp.setText("Establecer Posicion:");

        EstablecerBoton.setText("Establecer");
        EstablecerBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstablecerBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(MostrarTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(EstablecerBoton))
                    .addComponent(Labelp))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MostrarTurno))
                .addGap(18, 18, 18)
                .addComponent(Labelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EstablecerBoton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EstablecerBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstablecerBotonActionPerformed
        int Fila, Col;
        
        Fila = Integer.parseInt(JOptionPane.showInputDialog("Inserte Posicion en X"));
        
        //Validacion
        if(Fila > 3 || 1 > Fila) {
            JOptionPane.showMessageDialog(null, "Ingrese coordenada en rango!");
            Fila = Integer.parseInt(JOptionPane.showInputDialog("Inserte Posicion en X"));
        }
        
        Col = Integer.parseInt(JOptionPane.showInputDialog("Inserte Posicion en Y"));
        
        //Validacion
        if(Col > 3 || 1 > Col) {
            JOptionPane.showMessageDialog(null, "Ingrese coordenada en rango!");
            Col = Integer.parseInt(JOptionPane.showInputDialog("Inserte Posicion en Y"));
        }
        
        I.setTextoBoton(Fila, Col);
    }//GEN-LAST:event_EstablecerBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EstablecerBoton;
    private javax.swing.JLabel Labelp;
    private javax.swing.JLabel MostrarTurno;
    private javax.swing.JLabel Posicion1;
    private javax.swing.JLabel Posicion2;
    private javax.swing.JLabel Posicion3;
    private javax.swing.JLabel Posicion4;
    private javax.swing.JLabel Posicion5;
    private javax.swing.JLabel Posicion6;
    private javax.swing.JLabel Posicion7;
    private javax.swing.JLabel Posicion8;
    private javax.swing.JLabel Posicion9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
