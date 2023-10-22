package br.com.gamezone.dao.login;

import br.com.gamezone.conexao.ConexaoGame;
import br.com.gamezone.model.FuncionarioModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.sql.Connection;

public class LoginFuncionarioDAO {

    public ResultSet loginFuncionario(FuncionarioModel funcionarioModel) {

        String sql = "SELECT * FROM funcionario WHERE usuario = ? and senha = ? ";

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            con = ConexaoGame.ConexaoSQL();
            ps = con.prepareStatement(sql);

            ps.setString(1, funcionarioModel.getUsuario());
            ps.setString(2, funcionarioModel.getSenha());

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println("Erro autenticacao do administrador " + e);
        }

        return rs;
    }

}
