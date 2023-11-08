package br.senai.jandira.sp.Model;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private String servidor, senha, user, banco, porta;

    public Connection conexao;

    public Conexao() {
        this.servidor = "localhost";
        this.banco = "db_empresa";
        this.user = "root";
        this.senha = "bcd127";
    }

    public boolean connectDrive() {

        try {

            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.senha);

            return true;

        } catch (Exception erro) {
            System.out.println(erro);
            return false;
        }
    }

    public Connection getConnection (){
        connectDrive();
        return conexao;
    }
}