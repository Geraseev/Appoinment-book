//Lara Geraseev
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jay2 extends javax.swing.JFrame {
    private Gest gest = new Gest();
    private Pessoa p1 = new Pessoa();
    private static Jay2 jay2Unico;
    private Jay2() {
        initComponents();
    }
    public static Jay2 getJay2(){
        if(jay2Unico == null){
            jay2Unico = new Jay2();
        }
        return jay2Unico;
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastrar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Fixo = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        Celular = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Empresa = new javax.swing.JLabel();
        TipoE = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtTipoE = new javax.swing.JTextField();
        Excluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsultTO = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Janela 2");

        Cadastrar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Fechar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        Nome.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        Nome.setText("Nome: ");

        Email.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        Email.setText(" Email: ");

        txtNome.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        Limpar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Consultar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Consultar.setText("Consultar");
        Consultar.setActionCommand("Consultar Pessoa");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Fixo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        Fixo.setText("Tel fixo: ");

        txtTel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        Celular.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        Celular.setText("Celular: ");

        txtCel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel3.setText("Cadastro");

        Empresa.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        Empresa.setText("Empresa: ");

        TipoE.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        TipoE.setText("Tipo de empresa: ");

        txtEmpresa.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        txtTipoE.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        Excluir.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        ConsultTO.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        ConsultTO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Tel fixo", "Celuluar", "Empresa", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(ConsultTO);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Empresa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TipoE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipoE, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cadastrar)
                                        .addGap(32, 32, 32)
                                        .addComponent(Consultar)
                                        .addGap(26, 26, 26)
                                        .addComponent(Excluir))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Email)
                                    .addComponent(Nome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Celular)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Fixo)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(Limpar)
                                .addGap(34, 34, 34)
                                .addComponent(Fechar)))
                        .addGap(26, 26, 26)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(259, 259, 259))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(Celular)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fixo)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Empresa)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoE)
                    .addComponent(txtTipoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(Consultar)
                    .addComponent(Excluir)
                    .addComponent(Limpar)
                    .addComponent(Fechar))
                .addGap(46, 46, 46)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Saida",JOptionPane.YES_NO_OPTION);
        if(x == 0){
            dispose();
        }
    }//GEN-LAST:event_FecharActionPerformed
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
    }//GEN-LAST:event_txtNomeActionPerformed
    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        cadastrar();
        listar();
        limpar();
    }//GEN-LAST:event_CadastrarActionPerformed
    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        limpar();
    }//GEN-LAST:event_LimparActionPerformed
    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed
    }//GEN-LAST:event_txtCelActionPerformed
    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
    }//GEN-LAST:event_txtTelActionPerformed
    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        p1 = new Pessoa();                
        p1.setCel(Integer.parseInt(txtCel.getText()));
        p1.setFixo(Integer.parseInt(txtTel.getText()));               
        p1 = gest.consPsCod(p1);
        if(p1 != null){
            txtNome.setText(p1.getNome());
            txtEmail.setText(p1.getEmail());
            txtEmpresa.setText(p1.getEmpresa());
            txtTipoE.setText(p1.getTipo());
            txtTel.setText(Integer.toString(p1.getFixo()));
            txtCel.setText(Integer.toString(p1.getCel()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Entre com número de telefone fixo e celular cadastrados", "Erro de consulta", JOptionPane.OK_OPTION);
            limpar();
        }        
    }//GEN-LAST:event_ConsultarActionPerformed
    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        excluir();
        listar();
        limpar();
    }//GEN-LAST:event_ExcluirActionPerformed
    public void limpar(){
    txtNome.setText("");
    txtEmail.setText("");
    txtTel.setText("");
    txtCel.setText("");
    txtTipoE.setText("");
    txtEmpresa.setText("");
    txtNome.requestFocus();
}
    public void cadastrar(){
        p1 = new Pessoa();  
        try{
            p1.setNome(txtNome.getText());
            p1.setEmail(txtEmail.getText());
            p1.setCel(Integer.parseInt(txtCel.getText()));
            p1.setFixo(Integer.parseInt(txtTel.getText()));
            p1.setEmpresa(txtEmpresa.getText());
            p1.setTipo(txtTipoE.getText());               
            p1 = gest.cadPs(p1);        
            if(p1 != null){
                JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso", "Cadastro de pessoa", JOptionPane.OK_OPTION);
            }
            else{
                JOptionPane.showMessageDialog(null, "Essa pessoa já está cadastrada", "Erro de cadastro", 0);
            }
        }
        catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Telefone deve ser um número inteiro", "Erro de cadastro",0);
        }
    }
    public void excluir(){
        p1 = new Pessoa();
        p1.setFixo(Integer.parseInt(txtTel.getText()));
        p1.setCel(Integer.parseInt(txtCel.getText()));
        p1 = gest.removerPs(p1);
        
        if(p1 != null){
            JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso", "Remoção",0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pessoa não existe no cadastro", "Remoção",0);
        }
    }
    public void listar(){
        DefaultTableModel modelo = (DefaultTableModel) ConsultTO.getModel();
        modelo.setRowCount(0);
        int posLin = 0;
        
        for(Pessoa ps1: gest.getbdPs()){
            modelo.insertRow(posLin, new Object[]{ps1.getNome(),ps1.getEmail(),ps1.getFixo(),ps1.getCel(),ps1.getEmpresa(),ps1.getTipo()});      
            posLin++;
        }        
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jay2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                getJay2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel Celular;
    private javax.swing.JTable ConsultTO;
    private javax.swing.JButton Consultar;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Empresa;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Fechar;
    private javax.swing.JLabel Fixo;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel TipoE;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTipoE;
    // End of variables declaration//GEN-END:variables
}
