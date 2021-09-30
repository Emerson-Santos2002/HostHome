package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "senha";
    private static final String URL_BANCO = "jdbc:mysql://localhost/casa";
    
    public static Connection getConexaoBanco() throws Exception{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection conexao = DriverManager.getConnection(URL_BANCO,USUARIO,SENHA);
        
        return conexao;
    
    }

}

    