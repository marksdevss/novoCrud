package br.com.gamezone.dao.login;

import br.com.gamezone.conexao.ConexaoGame;
import br.com.gamezone.model.GerenteModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.Connection;

public class LoginGerenteDAO {
  
    
      public ResultSet LoginGerete(GerenteModel gerenteModel) {

        String sql = "SELECT * FROM gerente WHERE usuario = ? and senha = ? ";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            con = ConexaoGame.ConexaoSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, gerenteModel.getUsuario());
            ps.setString(2, gerenteModel.getSenha());

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println("Erro autenticacao do gerente " + e);
        }

        return rs;
    }
    
}
