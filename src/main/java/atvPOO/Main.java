package atvPOO;

import atvPOO.dao.PetDao;
import atvPOO.database.Conexao;
import atvPOO.model.Pet;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Connection conn = Conexao.getConnection();

        if(conn != null){
            System.out.println("Conectado com sucesso");
        } else{
            System.out.println("Erro ao conectar" );
        }

        PetDao dao2 = new  PetDao();

//        Pet passarinho = new Pet("Céu", "Passáro", 5, 1.2, "Dedé", true);
//        PetDao dao = new PetDao();
//        dao.inserir(passarinho);

//        dao2.deletar(4);

        List<Pet> lista = dao2.listar();
        for (int i=0;i<lista.size();i++) {
            if (lista.get(i) != null) {
                System.out.println(lista.get(i).apresentar());
            }
        }
    }
}




























