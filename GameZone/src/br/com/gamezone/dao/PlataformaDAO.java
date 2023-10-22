package br.com.gamezone.dao;

import br.com.gamezone.model.PlataformaModel;
import java.sql.Connection;
import br.com.gamezone.conexao.ConexaoGame;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PlataformaDAO {

    
    
    public static ArrayList<PlataformaModel> ShowPlataformas() {

        String sql = "SELECT * FROM plataformas";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<PlataformaModel> pms = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            connection = ConexaoGame.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                PlataformaModel pm = new PlataformaModel();

                pm.setId_plataforma(resultSet.getInt("id_plataforma"));
                pm.setPlataforma(resultSet.getString("plataforma"));
                pm.setId_jogo(resultSet.getInt("id_jogo"));
                

                pms.add(pm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return pms;
    }
    
    
}
