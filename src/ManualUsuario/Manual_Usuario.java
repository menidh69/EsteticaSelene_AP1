/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManualUsuario;

import ctrl.c.Principal;
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
        Funcionalidad4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel3.setText("Manual de ");

        Funcionalidad1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Funcionalidad1.setText("Venta Nueva");
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
        Funcionalidad2.setText("Buscador");
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

        Funcionalidad4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        Funcionalidad4.setText("Dudas?");
        Funcionalidad4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Funcionalidad4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Funcionalidad4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Funcionalidad4MouseExited(evt);
            }
        });

        jLabel2.setText("Logo");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Funcionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Funcionalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Funcionalidad4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Funcionalidad1)
                        .addGap(79, 79, 79)
                        .addComponent(Funcionalidad2)
                        .addGap(64, 64, 64)
                        .addComponent(Funcionalidad4)))
                .addGap(85, 85, 85)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Funcionalidad1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad1MouseEntered
        blueText(Funcionalidad1);
    }//GEN-LAST:event_Funcionalidad1MouseEntered

    private void Funcionalidad2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad2MouseEntered
    blueText(Funcionalidad2);
    }//GEN-LAST:event_Funcionalidad2MouseEntered

    private void Funcionalidad4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad4MouseEntered
        blueText(Funcionalidad4);
    }//GEN-LAST:event_Funcionalidad4MouseEntered

    private void Funcionalidad1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad1MouseExited
        normalText(Funcionalidad1);
    }//GEN-LAST:event_Funcionalidad1MouseExited

    private void Funcionalidad2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad2MouseExited
        normalText(Funcionalidad2);
    }//GEN-LAST:event_Funcionalidad2MouseExited

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

    private void Funcionalidad4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Funcionalidad4MouseClicked
        Funcion4 f1 = new Funcion4();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Funcionalidad4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Principal m = new Principal();
        m.setVisible(true);
        this.setVisible(false);             // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel Funcionalidad4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
