package atvPOO;

import atvPOO.dao.Dao;
import atvPOO.dao.PetDao;
import atvPOO.database.Conexao;
import atvPOO.model.Pet;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection conn = Conexao.getConnection();

        if(conn != null){
            System.out.println("Conectado com sucesso");
        } else{
            System.out.println("Erro ao conectar" );
        }

        Pet cachorro = new Pet("Mark", "Cachorro", 1, 2.5, "Franciele", true);
        PetDao dao = new PetDao();
        dao.inserir(cachorro);


    }
}