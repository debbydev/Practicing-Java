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
public class TypesOfTriangle extends javax.swing.JFrame {

    /**
     * Creates new form TypsOfTriangle
     */
    public TypesOfTriangle() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        slia = new javax.swing.JSlider();
        slib = new javax.swing.JSlider();
        slic = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        panresult = new javax.swing.JPanel();
        lblresult = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        lblb = new javax.swing.JLabel();
        lblc = new javax.swing.JLabel();
        btnverify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("side 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("side 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("side 3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("What's the sort of the triangle?");

        slia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        slia.setMaximum(20);
        slia.setValue(0);
        slia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliaStateChanged(evt);
            }
        });

        slib.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        slib.setMaximum(20);
        slib.setValue(0);
        slib.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slibStateChanged(evt);
            }
        });

        slic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        slic.setMaximum(20);
        slic.setValue(0);
        slic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slicStateChanged(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/579104542d9ca-perimetro-do-triangulo.jpg"))); // NOI18N

        lblresult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblresult.setText("jLabel6");

        javax.swing.GroupLayout panresultLayout = new javax.swing.GroupLayout(panresult);
        panresult.setLayout(panresultLayout);
        panresultLayout.setHorizontalGroup(
            panresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblresult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        panresultLayout.setVerticalGroup(
            panresultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panresultLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lblresult)
                .addGap(25, 25, 25))
        );

        lbla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbla.setForeground(new java.awt.Color(153, 153, 153));
        lbla.setText("0");

        lblb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblb.setForeground(new java.awt.Color(153, 153, 153));
        lblb.setText("0");

        lblc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblc.setForeground(new java.awt.Color(153, 153, 153));
        lblc.setText("0");

        btnverify.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnverify.setText("Show the type");
        btnverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(slia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbla))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(slib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnverify))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblc))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(panresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(slia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbla))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(slib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblb))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnverify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverifyActionPerformed
        // TODO add your handling code here:
       int a=slia.getValue();
       int b=slib.getValue();
       int c=slic.getValue();
       if ((a>0&&b>0&&c>0)&&(a<b+c && b<a+c && c<a+b)){
           if ((a>0&&b>0&&c>0)&&(a!=b && b!=a && b!=c)) {
                lblresult.setText ("It's a scalene triangle.");
            } else if ((a>0&&b>0&&c>0)&&(a==b && b==c)){
                lblresult.setText ("It's an equilateral triangle.");
            } else if ((a>0&&b>0&&c>0)&&(a==b || b==c|| a==c)){
                lblresult.setText ("It's an isosceles triangle.");
            }
        }  else {
            lblresult.setText("It is not a triangle.");
        }
        panresult.setVisible(true);
    }//GEN-LAST:event_btnverifyActionPerformed
       
    private void sliaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliaStateChanged
        // TODO add your handling code here:
        lbla.setText(Integer.toString(slia.getValue()));       
    }//GEN-LAST:event_sliaStateChanged

    private void slibStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slibStateChanged
        // TODO add your handling code here:
        lblb.setText(Integer.toString(slib.getValue()));
    }//GEN-LAST:event_slibStateChanged

    private void slicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slicStateChanged
        // TODO add your handling code here:
        lblc.setText(Integer.toString(slic.getValue()));
    }//GEN-LAST:event_slicStateChanged

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
            java.util.logging.Logger.getLogger(TypesOfTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TypesOfTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TypesOfTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TypesOfTriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TypesOfTriangle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnverify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblb;
    private javax.swing.JLabel lblc;
    private javax.swing.JLabel lblresult;
    private javax.swing.JPanel panresult;
    private javax.swing.JSlider slia;
    private javax.swing.JSlider slib;
    private javax.swing.JSlider slic;
    // End of variables declaration//GEN-END:variables
}
