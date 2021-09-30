package frame;

import dao.LoginDAO;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class TelaCadastro extends javax.swing.JFrame {
    
    int botaoEscolhido;
    
    public TelaCadastro() {
        initComponents();

    }

    //CADASTRO DO USUARIO
    private Boolean cadastro() {

        Usuario cadastro = new Usuario();
        
        cadastro.setLogin(campoLogin.getText());
        cadastro.setSenha(campoSenha.getText());
        cadastro.setNome(campoNome.getText());
        cadastro.setPerfil(botaoSelecionado());

        if (verificarCampos(cadastro)) {

            LoginDAO loginDAO = new LoginDAO();
            loginDAO.cadastrarUsuario(cadastro);
            return true;

        }
        else {
            return false;
        }
    }
    
    private String botaoSelecionado() {
        
        switch(botaoEscolhido){
            
            case 1 : return "locador";
            case 2 : return "locatario";
            default : return "";
        }

    }

    //VERIFICAÇÃO DE NULIDADE DOS CAMPOS
    private Boolean verificarCampos(Usuario cadastro) {

        if (cadastro.getLogin().isEmpty() == false) {

            if (cadastro.getSenha().isEmpty() == false) {

                if (cadastro.getNome().isEmpty() == false) {

                        if (cadastro.getPerfil().isEmpty() == false) {
                            return true;
                        } 
                        else {
                            JOptionPane.showMessageDialog(this, "Por favor selecione um perfil");
                            return false;
                        }
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Por favor preencha o nome");
                    return false;
                }
            } 
            else {
                JOptionPane.showMessageDialog(this, "Por favor preencha a senha");
                return false;
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "Por favor preencha o campo Login");
            return false;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPerfil = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botaoLocador = new javax.swing.JRadioButton();
        botaoLocatario = new javax.swing.JRadioButton();
        botaoCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(330, 368));
        setResizable(false);

        jDesktopPane1.setRequestFocusEnabled(false);

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel5.setText("Perfil");

        botaoLocador.setBackground(new java.awt.Color(255, 255, 255));
        grupoPerfil.add(botaoLocador);
        botaoLocador.setText("Locador");
        botaoLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLocadorActionPerformed(evt);
            }
        });

        botaoLocatario.setBackground(new java.awt.Color(255, 255, 255));
        grupoPerfil.add(botaoLocatario);
        botaoLocatario.setText("Locatario");
        botaoLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLocatarioActionPerformed(evt);
            }
        });

        botaoCadastro.setBackground(new java.awt.Color(0, 0, 255));
        botaoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastro.setText("Cadastrar");
        botaoCadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.darkGray));
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoLocador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoLocatario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(botaoLocador)
                                .addGap(18, 18, 18)
                                .addComponent(botaoLocatario)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(botaoLocador)
                    .addComponent(botaoLocatario))
                .addGap(42, 42, 42)
                .addComponent(botaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed

    }//GEN-LAST:event_campoSenhaActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        if (cadastro()) {
            JOptionPane.showMessageDialog(this, "Conta cadastrada com sucesso");
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLocadorActionPerformed
               botaoEscolhido = 1;        
    }//GEN-LAST:event_botaoLocadorActionPerformed

    private void botaoLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLocatarioActionPerformed
               botaoEscolhido = 2; 
    }//GEN-LAST:event_botaoLocatarioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastro().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JRadioButton botaoLocador;
    private javax.swing.JRadioButton botaoLocatario;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSenha;
    private javax.swing.ButtonGroup grupoPerfil;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
