package br.com.gamezone.dao;

import br.com.gamezone.model.ClienteModel;
import java.sql.Connection;
import br.com.gamezone.conexao.ConexaoGame;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    public void CreateCliente(ClienteModel clienteModel) {

        String sql = "INSERT INTO cliente (nome, email, idade, telefone) VALUES (?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, clienteModel.getNome());
            preparedStatement.setString(2, clienteModel.getEmail());
            preparedStatement.setString(3, clienteModel.getIdade());
            preparedStatement.setString(4, clienteModel.getTelefone());

            preparedStatement.execute();

        } catch (Exception e) {

            System.out.println(e + "Erro cadastro Cliente");

        }

    }

    public List<ClienteModel> ShowClientes() {

        String sql = "SELECT * FROM cliente";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<ClienteModel> clientesss = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                ClienteModel cm = new ClienteModel();

                cm.setId_cliente(resultSet.getInt("id_cliente"));
                cm.setNome(resultSet.getString("nome"));
                cm.setTelefone(resultSet.getString("telefone"));
                cm.setEmail(resultSet.getString("email"));
                cm.setIdade(resultSet.getString("Idade"));

                clientesss.add(cm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return clientesss;
    }

    public void DeleteClientes(int id_cliente) throws SQLException {

        String sql = "DELETE FROM cliente WHERE id_cliente = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id_cliente);

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
