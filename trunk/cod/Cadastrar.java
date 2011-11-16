
package aloka;

/**
 *
 * @author Marcus Vinicius
 */
public class Cadastrar extends javax.swing.JFrame {

    /** Creates new form Cadastrar */
    public Cadastrar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadastrarUser = new javax.swing.JButton();
        cadastarDepart = new javax.swing.JButton();
        cadastrarCurso = new javax.swing.JButton();
        cadastrarDisci = new javax.swing.JButton();
        cadastrarTurma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar - ALOKA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel1.setForeground(java.awt.SystemColor.activeCaptionBorder);

        cadastrarUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cadastrarUser.setText("Cadastrar Usuario");
        cadastrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUserActionPerformed(evt);
            }
        });

        cadastarDepart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cadastarDepart.setText("Cadastrar Departamento");
        cadastarDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarDepartActionPerformed(evt);
            }
        });

        cadastrarCurso.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarCurso.setText("Cadastrar Curso");

        cadastrarDisci.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarDisci.setText("Cadastrar Disciplina");

        cadastrarTurma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cadastrarTurma.setText("Cadastrar Turma");
        cadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadastrarDisci, 0, 0, Short.MAX_VALUE)
                    .addComponent(cadastrarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastarDepart))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cadastrarUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastarDepart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarDisci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//cadastrar usuario
private void cadastrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUserActionPerformed
new CadastropProfessor().setVisible(true);
Cadastrar.this.setVisible(false);
/*TelaInicial telaInicial = new TelaInicial(); //metodo n fuciona
telaInicial.setVisible(false);
 */
//new TelaInicial().setVisible(false); //metodo n fuciona
}//GEN-LAST:event_cadastrarUserActionPerformed

private void cadastarDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarDepartActionPerformed
// TODO 
}//GEN-LAST:event_cadastarDepartActionPerformed

private void cadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTurmaActionPerformed
// TODO 
}//GEN-LAST:event_cadastrarTurmaActionPerformed

   
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastarDepart;
    private javax.swing.JButton cadastrarCurso;
    private javax.swing.JButton cadastrarDisci;
    private javax.swing.JButton cadastrarTurma;
    private javax.swing.JButton cadastrarUser;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
