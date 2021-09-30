package frame;

import dao.CasaDAO;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Casa;
import modelo.CellRenderer;
import modelo.Funcao;

public class TelaLocador extends javax.swing.JFrame {
    
    int idUsuario;
    Casa casa = new Casa();    
    private DefaultTableModel modelo;

    public TelaLocador(int idUsuario) {

        initComponents();
        this.idUsuario = idUsuario;
        modelo = (DefaultTableModel) tabelaLocador.getModel();
        tabelaLocador.setDefaultRenderer(Object.class, new CellRenderer());

    }

    private TelaLocador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botaoAdicionar = new javax.swing.JButton();
        botaoApagar = new javax.swing.JButton();
        botaoDesconectar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocador = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Perfil = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        botaoAdicionar.setBackground(new java.awt.Color(0, 0, 255));
        botaoAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.darkGray));
        buttonGroup1.add(botaoAdicionar);
        botaoAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAdicionar.setPreferredSize(new java.awt.Dimension(100, 36));
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoApagar.setBackground(new java.awt.Color(0, 0, 255));
        botaoApagar.setForeground(new java.awt.Color(255, 255, 255));
        botaoApagar.setText("Apagar");
        botaoApagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.darkGray));
        buttonGroup1.add(botaoApagar);
        botaoApagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoApagar.setPreferredSize(new java.awt.Dimension(100, 36));
        botaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarActionPerformed(evt);
            }
        });

        botaoDesconectar.setBackground(new java.awt.Color(0, 0, 255));
        botaoDesconectar.setForeground(new java.awt.Color(255, 255, 255));
        botaoDesconectar.setText("Desconectar");
        botaoDesconectar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.darkGray));
        buttonGroup1.add(botaoDesconectar);
        botaoDesconectar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoDesconectar.setPreferredSize(new java.awt.Dimension(100, 36));
        botaoDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesconectarActionPerformed(evt);
            }
        });

        botaoEditar.setBackground(new java.awt.Color(0, 0, 255));
        botaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditar.setText("Editar");
        botaoEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.darkGray));
        buttonGroup1.add(botaoEditar);
        botaoEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEditar.setPreferredSize(new java.awt.Dimension(100, 36));
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(botaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(botaoDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabelaLocador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Endereço", "N° de quartos", "Valor", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLocador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabelaLocador);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(64, 30));

        Perfil.setText("Perfil");
        jMenuBar1.add(Perfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        edicaoCasa(1);
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesconectarActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoDesconectarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        edicaoCasa(2);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarActionPerformed

        int op = JOptionPane.showConfirmDialog(this, "Deseja deletar essa casa?", null, JOptionPane.YES_NO_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (op == JOptionPane.YES_OPTION) {
            deletarCasa();
        }
    }//GEN-LAST:event_botaoApagarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Funcao.preencherTabela(modelo, "locador", idUsuario);
    }//GEN-LAST:event_formWindowGainedFocus

    private void edicaoCasa(int escolha) {
        
        if (escolha == 2){
            try{
                Integer idLinha = tabelaLocador.getSelectedRow();
                casa = Funcao.recuperaValores(idLinha, modelo);
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Por favor selecione uma linha");
            }          
        }
        
        TelaEdicaoCasa tela = new TelaEdicaoCasa(idUsuario, escolha, casa);
        tela.setVisible(true);

    }

    private void deletarCasa() {

        try {
            Integer id = (Integer) modelo.getValueAt(tabelaLocador.getSelectedRow(), 0);

            CasaDAO casaDAO = new CasaDAO();
            int linha = casaDAO.deletar(id, idUsuario);

            if (linha > 0) {

                modelo.removeRow(tabelaLocador.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Casa excluída com sucesso");

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Por favor seleciona uma casa");
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new TelaLocador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Perfil;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoApagar;
    private javax.swing.JButton botaoDesconectar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabelaLocador;
    // End of variables declaration//GEN-END:variables

}
