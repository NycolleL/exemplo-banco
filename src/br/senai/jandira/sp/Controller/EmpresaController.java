package br.senai.jandira.sp.Controller;

import br.senai.jandira.sp.Model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {

public void cunsultarFuncionarios () throws SQLException {
    Conexao conexao = new Conexao();

    Connection objConnetion = conexao.getConnection();

    Statement statement = objConnetion.createStatement();

    String queryConsulta = "select * from funcionarios";

    ResultSet resultSet = statement.executeQuery(queryConsulta);

    while (resultSet.next()){
        int idFuncionario = resultSet.getInt("id_funcionario");
        String nome = resultSet.getString("nome");
        String departamento = resultSet.getString("departamento");
        String cargo = resultSet.getString("cargo");
        double salario = resultSet.getDouble("salario");

        System.out.println(idFuncionario);
        System.out.println(nome);
        System.out.println(departamento);
        System.out.println(cargo);
        System.out.println(salario);

    }
    }


}
