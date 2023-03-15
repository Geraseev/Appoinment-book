//Lara Geraseev
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    private static Principal jay1Unico;    
    public Principal (){
        initComponents();
    }
    public static Principal getJay1(){
        if(jay1Unico == null){
            jay1Unico = new Principal();
        }
        return jay1Unico;
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Fechar = new javax.swing.JButton();
        BarraPrin = new javax.swing.JMenuBar();
        Principal = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela 1");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Lista telefônica");

        Fechar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        Principal.setText("Principal");

        Cadastro.setText("Cadastro");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });
        Principal.add(Cadastro);

        BarraPrin.add(Principal);

        setJMenuBar(BarraPrin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Fechar)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(Fechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Saida",JOptionPane.YES_NO_OPTION);
        if(x == 0){
            dispose();
        }
    }//GEN-LAST:event_FecharActionPerformed
    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        Jay2.getJay2().setVisible(true);
    }//GEN-LAST:event_CadastroActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getJay1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraPrin;
    private javax.swing.JMenuItem Cadastro;
    private javax.swing.JButton Fechar;
    private javax.swing.JMenu Principal;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
