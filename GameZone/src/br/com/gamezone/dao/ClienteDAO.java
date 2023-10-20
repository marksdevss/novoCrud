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

        String sql = "INSERT INTO clientes (nome, email, telefone, endereco, cidade, estado, cep VALUES (?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, clienteModel.getNome());
            preparedStatement.setString(2, clienteModel.getEmail());
            preparedStatement.setString(3, clienteModel.getTelefone());
            preparedStatement.setString(4, clienteModel.getEndereco());
            preparedStatement.setString(5, clienteModel.getCidade());
            preparedStatement.setString(6, clienteModel.getEstado());
            preparedStatement.setString(7, clienteModel.getCep());
           

            preparedStatement.execute();

        } catch (Exception e) {

            System.out.println(e + "Erro cadastro Cliente");

        }

    }

    public List<ClienteDAO> ShowClientes() {

        String sql = "SELECT * FROM clientes";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<ClienteDAO> clientess = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                ClienteModel clienteModel = new ClienteModel();

                clienteModel.setId_cliente(resultSet.getInt("id_cliente"));
                clienteModel.setNome(resultSet.getString("nome"));
                clienteModel.setEmail(resultSet.getString("email"));
                clienteModel.setTelefone(resultSet.getString("telefone"));
                clienteModel.setEndereco(resultSet.getString("endereco"));
                clienteModel.setCidade(resultSet.getString("cidade"));
                clienteModel.setEstado(resultSet.getString("estado"));
                clienteModel.setCep(resultSet.getString("ce"));
                

                clienteModel.add(clientess);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return  clientess;
    }

}
