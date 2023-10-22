package br.com.gamezone.dao;

import br.com.gamezone.model.CategoriaModel;
import java.sql.Connection;
import br.com.gamezone.conexao.ConexaoGame;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaDAO {


    public static ArrayList<CategoriaModel> ShowCategoria() {

        String sql = "SELECT * FROM categorias";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<CategoriaModel> cms = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                CategoriaModel cm = new CategoriaModel();

                cm.setId_categoria(resultSet.getInt("id_categoria"));
                cm.setCategoria(resultSet.getString("categoria"));
                cm.setId_jogo(resultSet.getInt("id_jogo"));
                

                cms.add(cm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return cms;
    }
    
}
