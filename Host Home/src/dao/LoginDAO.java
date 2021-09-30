package dao;

import conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class LoginDAO {

    Connection conexao;
    PreparedStatement sql;
    ResultSet rs;

    public Boolean cadastrarUsuario(Usuario usuario) {

        String inserir = "INSERT INTO usuario(login, senha, perfil, nome)"
                       + " VALUES(?, ?, ?, ?)";
        
        try {
            //CONFIGURAR A CONEXÃO
            metodoConexaoSQL(inserir);

            //CONFIGURAR OS VALORES A SEREM INSERIDOS
            sql.setString(1, usuario.getLogin());
            sql.setString(2, usuario.getSenha());
            sql.setString(3, usuario.getPerfil());
            sql.setString(4, usuario.getNome());

            //EXECUTAR A QUERY
            sql.execute();
            return true;

        } 
        catch (SQLException ex) {
            return false;
        }
        finally{
            fecharConexao();
        }
        
    }

    public Usuario verificarLogin(String login) {

        Usuario usuario = new Usuario();
        usuario.setLogin("vazio");

        ////RECUPERANDO OS LOGINS DO BANCO
        List<Usuario> listaUsuario;
        listaUsuario = getLogins();

        //VERIFICANDO SE TEM LOGIN REGISTRADO NO BANCO
        if (listaUsuario.isEmpty() == false) {

            for (int i = 0; i < listaUsuario.size(); i++) {

                Usuario user = listaUsuario.get(i);

                if (login.equals(user.getLogin())) {

                    i = listaUsuario.size();
                    usuario.setId(user.getId());
                    usuario.setLogin(user.getLogin());
                    usuario.setPerfil(user.getPerfil());

                }
            }
        }
        
        return usuario;
    }

    public List<Usuario> getLogins() {

        String getLoginSQL = "SELECT  id, login, perfil FROM usuario";
        List<Usuario> users = new ArrayList<>();

        try {
            metodoConexaoSQL(getLoginSQL);

            rs = sql.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setPerfil(rs.getString("perfil"));

                users.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        fecharConexao();
        return users;
    }

    public Boolean verificarSenha(Usuario usuario) {
        
        String senha;   
        String senhaSQL = "SELECT senha FROM usuario WHERE id = ?";
        Boolean result = false;           

        try {
            
            metodoConexaoSQL(senhaSQL);
            
            sql.setInt(1, usuario.getId());
            
            rs = sql.executeQuery();
            rs.next();

            senha = rs.getString("senha");
            
            if (usuario.getSenha().equals(senha)) {
                result = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        
        fecharConexao();
        return result;
    }

    //CONECTA AO BANCO DE DADOS
    public void metodoConexaoSQL(String comandoSQL) {

        try {
            
            conexao = ConexaoMySQL.getConexaoBanco();
            sql = (PreparedStatement) conexao.prepareStatement(comandoSQL);
            
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    //EM CASO DE ERRO FECHA A CONEXÃO COM O BD
    public void fecharConexao() {
        try {
            if (sql != null) {
                sql.close();
            }

            if (conexao != null) {
                conexao.close();
            }
            if (rs != null){
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
