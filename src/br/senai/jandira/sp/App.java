package br.senai.jandira.sp;

import br.senai.jandira.sp.Controller.EmpresaController;
import br.senai.jandira.sp.Model.Conexao;

import java.sql.SQLException;

public class App {
public static void main (String[] args) throws SQLException {
    EmpresaController empresaController = new EmpresaController();
    empresaController.cunsultarFuncionarios();
    }
}
