
package aloka;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcus Vinicius
 */
public class TelaInicial extends javax.swing.JFrame {

    /** Creates new form TelaInicial */
    public TelaInicial() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        removerUser = new javax.swing.JButton();
        removerDepart = new javax.swing.JButton();
        removerCurso = new javax.swing.JButton();
        removerDisci = new javax.swing.JButton();
        removerTurma = new javax.swing.JButton();
        pesquisar = new javax.swing.JButton();
        cadastrarUser = new javax.swing.JButton();
        cadastarDepart = new javax.swing.JButton();
        cadastrarCurso = new javax.swing.JButton();
        cadastrarDisci = new javax.swing.JButton();
        cadastrarTurma = new javax.swing.JButton();
        logoff = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu ALOKA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 16))); // NOI18N

        removerUser.setFont(new java.awt.Font("Tahoma", 1, 12));
        removerUser.setText("Remover Usuario");

        removerDepart.setFont(new java.awt.Font("Tahoma", 1, 12));
        removerDepart.setText("Remover Departamento");

        removerCurso.setFont(new java.awt.Font("Tahoma", 1, 12));
        removerCurso.setText("Remover Curso");

        removerDisci.setFont(new java.awt.Font("Tahoma", 1, 12));
        removerDisci.setText("Remover Disciplina");

        removerTurma.setFont(new java.awt.Font("Tahoma", 1, 12));
        removerTurma.setText("Remover Turma");

        pesquisar.setFont(new java.awt.Font("Tahoma", 1, 12));
        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        cadastrarUser.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarUser.setText("Cadastrar Usuario");
        cadastrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUserActionPerformed(evt);
            }
        });

        cadastarDepart.setFont(new java.awt.Font("Tahoma", 1, 12));
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

        cadastrarTurma.setFont(new java.awt.Font("Tahoma", 1, 12));
        cadastrarTurma.setText("Cadastrar Turma");
        cadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarTurmaActionPerformed(evt);
            }
        });

        logoff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoff.setText("Logoff");
        logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadastrarDisci, 0, 0, Short.MAX_VALUE)
                            .addComponent(cadastrarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastarDepart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removerDepart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removerCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(removerDisci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(removerUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(removerTurma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addGap(133, 133, 133)
                        .addComponent(pesquisar))
                    .addComponent(logoff, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cadastrarUser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cadastarDepart)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cadastrarCurso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cadastrarDisci)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cadastrarTurma))
                        .addComponent(pesquisar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(removerDepart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerDisci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerTurma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(logoff)
                .addGap(23, 23, 23))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarTurmaActionPerformed
// TODO 
}//GEN-LAST:event_cadastrarTurmaActionPerformed

private void cadastrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUserActionPerformed
new CadastropProfessor().setVisible(true);
}//GEN-LAST:event_cadastrarUserActionPerformed

private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
new Pesquisar().setVisible(true);
}//GEN-LAST:event_pesquisarActionPerformed

private void cadastarDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarDepartActionPerformed
// TODO 
}//GEN-LAST:event_cadastarDepartActionPerformed

private void logoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffActionPerformed
int opçao = 0;
opçao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fazer logoff?", "Atenção!", JOptionPane.YES_NO_OPTION);
    if (opçao == JOptionPane.YES_OPTION){
        new Login().setVisible(true);
    TelaInicial.this.setVisible (false);}
}//GEN-LAST:event_logoffActionPerformed


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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastarDepart;
    private javax.swing.JButton cadastrarCurso;
    private javax.swing.JButton cadastrarDisci;
    private javax.swing.JButton cadastrarTurma;
    private javax.swing.JButton cadastrarUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JButton logoff;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton removerCurso;
    private javax.swing.JButton removerDepart;
    private javax.swing.JButton removerDisci;
    private javax.swing.JButton removerTurma;
    private javax.swing.JButton removerUser;
    // End of variables declaration//GEN-END:variables
}
