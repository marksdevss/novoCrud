
package br.com.gamezone.dao.login;

import br.com.gamezone.conexao.ConexaoGame;
import br.com.gamezone.model.AdministradorModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.Connection;

public class LoginAdministraddorDAO {
    
    
    public ResultSet LoginAdministrador(AdministradorModel administradorModel) {

        String sql = "SELECT * FROM Administrador WHERE usuario = ? and senha = ? ";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            con = ConexaoGame.ConexaoSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, administradorModel.getUsuario());
            ps.setString(2, administradorModel.getSenha());

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println("Erro autenticacao do administrador " + e);
        }

        return rs;
    }
    
    
}
