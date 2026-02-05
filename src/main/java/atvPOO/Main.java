package atvPOO;

import atvPOO.database.Conexao;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection conn = Conexao.getConnection();

        if(conn != null){
            System.out.println("Conectado com sucesso");
        } else{
            System.out.println("Erro ao conectar" );
        }

    }
}