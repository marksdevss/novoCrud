package br.com.gamezone.dao;

import br.com.gamezone.model.EstoqueModel;
import java.sql.Connection;
import br.com.gamezone.conexao.ConexaoGame;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EstoqueDAO {

    public void CriarEstoque(EstoqueModel estoqueModel) throws Exception {

        String sql = "INSERT INTO estoque (id_jogo, nome_jogo, quantidade, preco_unitario) VALUES (?, ?, ?, ?)";

        Connection conexao = null;
        PreparedStatement ps = null;

        try {

            conexao = ConexaoGame.ConexaoSQL();
            ps = conexao.prepareStatement(sql);

            ps.setInt(1, estoqueModel.getId_jogo());
            ps.setString(2, estoqueModel.getNome_jogo());
            ps.setInt(3, estoqueModel.getQuantidade());
            ps.setDouble(4, estoqueModel.getPreco_unitario());

            ps.execute();

        } finally {

            if (ps != null) {
                ps.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }
    }
    
     public List<EstoqueModel> ShowEstoque() {

        String sql = "SELECT * FROM estoque";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<EstoqueModel> ems = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                EstoqueModel em = new EstoqueModel();

                em.setId_jogo(resultSet.getInt("id_jogo"));
                em.setNome_jogo(resultSet.getString("nome_jogo"));
                em.setQuantidade(resultSet.getInt("quantidade"));
                em.setPreco_unitario(resultSet.getInt("preco_unitario"));

                ems.add(em);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return ems;
    }


}
