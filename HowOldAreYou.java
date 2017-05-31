
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Débora
 * Project for the Java training, taught by "Curso em Vídeo".
 */
public class HowOldAreYou extends javax.swing.JFrame {

    /**
     * Creates new form YearBirth
     */
    public HowOldAreYou() {
        initComponents();
        panresult.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblresultado = new javax.swing.JLabel();
        btnyear = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        panresult = new javax.swing.JPanel();
        lblresult2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnresult = new javax.swing.JButton();

        lblresultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblresultado.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnyear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnyear.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, null, 1));
        getContentPane().add(btnyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 61, 101, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Date of born");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 64, -1, -1));

        lblresult2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblresult2.setForeground(new java.awt.Color(0, 0, 255));
        lblresult2.setText("Result");
        lblresult2.setToolTipText("");

        javax.swing.GroupLayout panresultLayout = new javax.swing.GroupLayout(panresult);
        panresult.setLayout(panresultLayout);
        panresultLayout.setHorizontalGroup(
            panresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panresultLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblresult2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        panresultLayout.setVerticalGroup(
            panresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panresultLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblresult2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(panresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 300, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 236, -1));

        btnresult.setBackground(new java.awt.Color(153, 153, 153));
        btnresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnresult.setForeground(new java.awt.Color(0, 102, 153));
        btnresult.setText("How old are you?");
        btnresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultActionPerformed(evt);
            }
        });
        getContentPane().add(btnresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultActionPerformed
        // TODO add your handling code here:
        panresult.setVisible(true);
        int date = Integer.parseInt(btnyear.getValue().toString());
        Calendar now=Calendar.getInstance();
        int yearnow = now.get(Calendar.YEAR);
        int year = yearnow-date;
        lblresult2.setText("You are "+year+" years old.");
        
    }//GEN-LAST:event_btnresultActionPerformed

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
            java.util.logging.Logger.getLogger(HowOldAreYou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HowOldAreYou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HowOldAreYou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HowOldAreYou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HowOldAreYou().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnresult;
    private javax.swing.JSpinner btnyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblresult2;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JPanel panresult;
    // End of variables declaration//GEN-END:variables
}