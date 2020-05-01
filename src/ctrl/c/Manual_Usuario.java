/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl.c;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author propietario
 */
public class Manual_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Manual_Usuario_Main
     */
    public Manual_Usuario() {
        initComponents();
        ImageIcon imagen= new ImageIcon(getClass().getResource("/imagenes/Icon.jpeg"));
       Icon fondoI= new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),Image.SCALE_DEFAULT));
       jLabel2.setIcon(fondoI);
       Icon fondo= new ImageIcon(imagen.getImage().getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(),Image.SCALE_DEFAULT));
       jLabel7.setIcon(fondo);
       
       this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Funcionalidad1 = new javax.swing.JLabel();
        Funcionalidad2 = new javax.swing.JLabel();
        Funcionalidad3 = new javax.swing.JLabel();
        Funcionalidad4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registrobtm = new javax.swing.JButton();
        ventabtm = new javax.swing.JButton();
        btm3 = new javax.swing.JButton();
        btm4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel3.setText("Manual de ");

        Funcionalidad1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Funcionalidad1.setText("Funcionlidad 1");
        Funcionalidad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Funcionalidad1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Funcionalidad1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Funcionalidad1MouseExited(evt);
            }
        });

        Funcionalidad2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Funcionalidad2.setText("Funcionalidad 2");
        Funcionalidad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Funcionalidad2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Funcionalidad2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Funcionalidad2MouseEntered(evt);
            }
        });

        Funcionalidad3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Funcionalidad3.setText("Funcionalidad 3");
        Funcionalidad3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Funcionalidad3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Funcionalidad3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Funcionalidad3MouseEntered(evt);
            }
        });

        Funcionalidad4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Funcionalidad4.setText("Funcionalidad 4");
        Funcionalidad4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Funcionalidad4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Funcionalidad4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Funcionalidad4MouseEntered(evt);
            }
        });

        jLabel2.setText("Logo");

        jLabel4.setText("Tienes alguna pregunta?");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Email:");

        jLabel5.setText("equipo1@unison.mx");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Icon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9))
        );

        registrobtm.setText("Registros");
        registrobtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrobtmActionPerformed(evt);
            }
        });

        ventabtm.setText("Nueva venta");
        ventabtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventabtmActionPerformed(evt);
            }
        });

        btm3.setText("     ");
        btm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm3ActionPerformed(evt);
            }
        });

        btm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Funcionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Funcionalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Funcionalidad3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Funcionalidad4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrobtm)
                    .addComponent(ventabtm)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(btm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btm3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Funcionalidad1)
                    .addComponent(registrobtm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Funcionalidad2)
                    .addComponent(ventabtm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Funcionalidad3)
                    .addComponent(btm3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Funcionalidad4)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(btm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Funcionalidad1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad1MouseEntered
        blueText(Funcionalidad1);
    }//GEN-LAST:event_Funcionalidad1MouseEntered

    private void Funcionalidad2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad2MouseEntered
    blueText(Funcionalidad2);
    }//GEN-LAST:event_Funcionalidad2MouseEntered

    private void Funcionalidad3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad3MouseEntered
        blueText(Funcionalidad3);
    }//GEN-LAST:event_Funcionalidad3MouseEntered

    private void Funcionalidad4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad4MouseEntered
        blueText(Funcionalidad4);
    }//GEN-LAST:event_Funcionalidad4MouseEntered

    private void Funcionalidad1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad1MouseExited
        normalText(Funcionalidad1);
    }//GEN-LAST:event_Funcionalidad1MouseExited

    private void Funcionalidad2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad2MouseExited
        normalText(Funcionalidad2);
    }//GEN-LAST:event_Funcionalidad2MouseExited

    private void Funcionalidad3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad3MouseExited
        normalText(Funcionalidad3);
    }//GEN-LAST:event_Funcionalidad3MouseExited

    private void Funcionalidad4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad4MouseExited
        normalText(Funcionalidad4);
    }//GEN-LAST:event_Funcionalidad4MouseExited

    private void Funcionalidad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad1MouseClicked
        Funcion1 f1 = new Funcion1();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Funcionalidad1MouseClicked

    private void Funcionalidad2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad2MouseClicked
        Funcion2 f1 = new Funcion2();
        f1.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_Funcionalidad2MouseClicked

    private void Funcionalidad3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad3MouseClicked
        Funcion3 f1 = new Funcion3();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Funcionalidad3MouseClicked

    private void Funcionalidad4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad4MouseClicked
        Funcion4 f1 = new Funcion4();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Funcionalidad4MouseClicked

    private void registrobtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrobtmActionPerformed
       Funcion1 open = new Funcion1();
       open.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_registrobtmActionPerformed

    private void ventabtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventabtmActionPerformed
       Funcion2 open = new Funcion2();
       open.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_ventabtmActionPerformed

    private void btm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm3ActionPerformed
      Funcion3 open = new Funcion3();
      open.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btm3ActionPerformed

    private void btm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm4ActionPerformed
      Funcion4 open = new Funcion4();
      open.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btm4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manual_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manual_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manual_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manual_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manual_Usuario().setVisible(true);
                
            }
        });
    }
    public void blueText(JLabel label){
        label.setForeground(Color.blue);
    }
    public void normalText(JLabel label){
        label.setForeground(Color.black);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Funcionalidad1;
    private javax.swing.JLabel Funcionalidad2;
    private javax.swing.JLabel Funcionalidad3;
    private javax.swing.JLabel Funcionalidad4;
    private javax.swing.JButton btm3;
    private javax.swing.JButton btm4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrobtm;
    private javax.swing.JButton ventabtm;
    // End of variables declaration//GEN-END:variables
}