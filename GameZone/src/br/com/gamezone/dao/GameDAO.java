package br.com.gamezone.dao;

import br.com.gamezone.conexao.ConexaoGame;
import br.com.gamezone.model.GameModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GameDAO {

    public void CreateGame(GameModel gameModel) {

        String sql = "INSERT INTO jogos (nome,descricao,data_cadastro,preco,estoque) VALUES (?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, gameModel.getNome());
            preparedStatement.setString(2, gameModel.getDescricao());
            preparedStatement.setString(3, gameModel.getData_cadastro());
            preparedStatement.setDouble(4, gameModel.getPreco());
            preparedStatement.setInt(5, gameModel.getEstoque());

            preparedStatement.execute();

        } catch (Exception e) {

            System.out.println(e + "Erro cadastro games");

        }

    }

    public List<GameModel> ShowGames() {

        String sql = "SELECT * FROM jogos";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<GameModel> jogos = new ArrayList<>();
        //classe que vai recuperar os dados do banco.
        ResultSet resultSet = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                GameModel jogoss = new GameModel();

                jogoss.setId_jogo(resultSet.getInt("id_jogo"));
                jogoss.setNome(resultSet.getString("nome"));
                jogoss.setDescricao(resultSet.getString("descricao"));
                jogoss.setData_cadastro(resultSet.getString("data_cadastro"));
                jogoss.setPreco(resultSet.getDouble("preco"));
                jogoss.setEstoque(resultSet.getInt("estoque"));

                jogos.add(jogoss);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return jogos;
    }

    public void UpdateGame(GameModel gameModel) {

        String sql = "UPDATE jogo SET nome = ?, genero = ?,descricao = ?,data_compra = ?,desenvolvedora = ?,plataformas=?,avaliacao = ?,preco= ?,estoque=? WHERE id_jogo=?";

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = ConexaoGame.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            // ps.setString(1, gameModel.getNome());
            //  ps.setString(2, gameModel.getGenero());
            //  ps.setString(3, gameModel.getDescricao());
            //  ps.setString(4, gameModel.getData_compra());
            // ps.setString(5, gameModel.getDescricao());
            // ps.setString(6, gameModel.getDesenvolvedora());
            // ps.setString(7, gameModel.getPlataformas());
            // ps.setString(8, gameModel.getAvaliacao());
            ps.setDouble(9, gameModel.getPreco());
            ps.setInt(10, gameModel.getEstoque());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Jogo atualizado com sucesso");

        } catch (Exception e) {
            System.out.println("Erro:  " + e);
        }
    }

    public void DeleteGame(int id_jogo) throws SQLException {

        String sql = "DELETE FROM jogos WHERE id_jogo = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id_jogo);

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }

    }

}
