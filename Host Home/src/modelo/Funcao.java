package modelo;

import dao.CasaDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funcao {
    
    public static void preencherTabela(DefaultTableModel modelo, String tela,int idUsuario){
    
        modelo.getDataVector().clear();
        try {
            CasaDAO casaDAO = new CasaDAO();
            casaDAO.listar(idUsuario, tela).forEach((house) -> {
                modelo.addRow(new Object[]{
                    house.getId(), house.getEndereco(), house.getNumero_de_quartos(),
                    house.getValor(), Funcao.verificaSituacao(house.getSituação())});
            });
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    public static Casa recuperaValores(int idLinha, DefaultTableModel modelo){
        
        Casa casa = new Casa();

        casa.setId(Integer.valueOf( modelo.getValueAt(idLinha, 0).toString() ));
                
        casa.setEndereco( modelo.getValueAt(idLinha, 1).toString() );
        
        casa.setNumero_de_quartos( Integer.valueOf( modelo.getValueAt(idLinha, 2).toString() ));
        
        casa.setValor( Integer.valueOf( modelo.getValueAt(idLinha, 3).toString() ));

        //executa um equals para pegar o valor de String e converter para Boolean
        String situacao = modelo.getValueAt(idLinha, 4).toString();
        
        casa.setSituação( verificaAlugado(situacao));
        
        return casa;
        
    }
    
    public static String verificaSituacao(Boolean situacao){
    
        if (situacao) {
            return "Alugado";
        }
        return "Desalugado";
        
    }
    
    public static Boolean verificaAlugado(String alugado){
        
        return alugado.equals("Alugado");
        
    }
    
    public static void erroSalvarCasa(){
        JOptionPane.showMessageDialog(null,"Erro ao salvar casa");
    }
}
