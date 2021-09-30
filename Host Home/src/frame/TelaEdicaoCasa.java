package frame;

import dao.CasaDAO;
import javax.swing.JOptionPane;
import modelo.Casa;

public class TelaEdicaoCasa extends javax.swing.JFrame {

    Casa casa;
    int escolha;
    int idUsuario;

    //Escolha é o botão selecionado na tela locador
    public TelaEdicaoCasa(int idUsuario, int escolha, Casa casa) {
        
        initComponents();
        this.idUsuario = idUsuario;
        this.escolha = escolha;
        this.casa = casa;

        if (escolha == 2) {
            campoEndereco.setText(casa.getEndereco());
            campoQuarto.setText(String.valueOf(casa.getNumero_de_quartos()));
            campoValor.setText(String.valueOf(casa.getValor()));
        }
    }

    private TelaEdicaoCasa() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoQuarto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        botaoSalvarCasa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setRequestFocusEnabled(false);

        jLabel1.setText("Endereco");

        jLabel2.setText("N° de quartos");

        campoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuartoActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor");

        botaoSalvarCasa.setBackground(new java.awt.Color(0, 0, 255));
        botaoSalvarCasa.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvarCasa.setText("Salvar");
        botaoSalvarCasa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.darkGray));
        botaoSalvarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarCasaActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoQuarto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(campoValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoSalvarCasa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoSalvarCasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57)
                .addComponent(botaoSalvarCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuartoActionPerformed

    }//GEN-LAST:event_campoQuartoActionPerformed

    private void botaoSalvarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarCasaActionPerformed
        if(editarCasa()){
            JOptionPane.showMessageDialog(this, "Casa salva com sucesso");
        }
    }//GEN-LAST:event_botaoSalvarCasaActionPerformed

    private Boolean editarCasa() {

        String endereco = campoEndereco.getText();
        String nQuartos = campoQuarto.getText();
        String valor = campoValor.getText();

        if (verificarCampos(endereco, valor, nQuartos)) {
            
            CasaDAO casaDAO = new CasaDAO();
            
            casa.setIdProprietario(idUsuario);
            casa.setEndereco(endereco);
            
            casa.setNumero_de_quartos(Integer.valueOf(nQuartos));
            casa.setValor(Integer.valueOf(valor));


            switch (escolha) {
                case 1:
                    if (casaDAO.inserir(casa)) {
                        JOptionPane.showMessageDialog(this, "Casa adicionada com sucesso");
                        this.dispose();
                    }
                    break;

                case 2:
                    if (casaDAO.editar(casa)) {
                        JOptionPane.showMessageDialog(this, "Casa editada com sucesso");
                        this.dispose();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Erro no perfil");
            }
        }
        return false;
    }

    private Boolean verificarCampos(String endereco, String valor, String quarto) {

        if (!endereco.isEmpty()) {

            if (!valor.isEmpty()) {

                if (!quarto.isEmpty()) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor digite o numero de Quartos");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor preencha o campo do Valor do aluguel");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor preencha o campo Endereço");
        }

        return false;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicaoCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaEdicaoCasa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvarCasa;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoQuarto;
    private javax.swing.JTextField campoValor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
