package dao;

import conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Casa;

public class CasaDAO {

    Connection conexao;
    PreparedStatement statement;
    ResultSet rSet;

    public Boolean inserir(Casa casa) {

        String inserir = "INSERT INTO casa(proprietario, endereco, quartos, valor, situacao) VALUES (?, ?, ?, ?, false)";

        try {

            metodoConexaoSQL(inserir);

            statement.setInt(1, casa.getIdProprietario());
            statement.setString(2, casa.getEndereco());
            statement.setInt(3, casa.getNumero_de_quartos());
            statement.setInt(4, casa.getValor());

            statement.executeUpdate();

        } catch (SQLException e) {
            return false;
        } finally {
            fecharConexao();

        }
        return true;
    }

    public Boolean editar(Casa casa) {

        String atualizar = "UPDATE casa SET endereco = ?, quartos = ?, valor = ? WHERE id = ?";

        try {

            metodoConexaoSQL(atualizar);
            statement.setString(1, casa.getEndereco());
            statement.setInt(2, casa.getNumero_de_quartos());
            statement.setInt(3, casa.getValor());
            statement.setInt(4, casa.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            return false;
        } finally {
            fecharConexao();
        }

        return true;
    }

    public int deletar(int idCasa, int idProprietario) {

        String deletar = "DELETE FROM casa where id = ? AND proprietario = ?";
        int linha = 0;

        try {

            metodoConexaoSQL(deletar);

            statement.setInt(1, idCasa);
            statement.setInt(2, idProprietario);
            return statement.executeUpdate();

        } catch (SQLException e) {
        } finally {
            fecharConexao();

        }
        return 0;
    }

    public List<Casa> listar(int idUsuario, String tela) {

        
        List<Casa> casas = new ArrayList<>();

        try {

            if (tela.equals("locador")) {
                
                String listarCasaLocador = "SELECT * FROM casa where proprietario = ?";
                metodoConexaoSQL(listarCasaLocador);
                statement.setInt(1, idUsuario);
                
            }else{
                
                String listarCasaLocatario = "Select * from casa";
                metodoConexaoSQL(listarCasaLocatario);
                
            }    
                
                rSet = statement.executeQuery();

                if (rSet.next()) {

                    do {

                        Casa house = new Casa();
                        house.setEndereco(rSet.getString("endereco"));
                        house.setNumero_de_quartos(rSet.getInt("quartos"));
                        house.setValor(rSet.getInt("valor"));
                        house.setSituação(rSet.getBoolean("situacao"));
                        house.setId(rSet.getInt("id"));

                        casas.add(house);

                    } while (rSet.next());
                }

            }catch(SQLException e){
            
        }

            fecharConexao();
            return casas;
        }

    

    public void metodoConexaoSQL(String comandoSQL) {

        try {

            conexao = ConexaoMySQL.getConexaoBanco();
            statement = (PreparedStatement) conexao.prepareStatement(comandoSQL);

        } catch (Exception ex) {
        }

    }

    public void fecharConexao() {

        try {
            if (statement != null) {
                statement.close();
            }

            if (conexao != null) {
                conexao.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        } catch (SQLException e) {

        }

    }

}
