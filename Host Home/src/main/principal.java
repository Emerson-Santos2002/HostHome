package main;

import frame.TelaLogin;
import javax.swing.UIManager;

public class principal {

    public static void main(String[] args) {
        
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        UIManager.put("OptionPane.noButtonText" , "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");    
               
    }
}
