package atvPOO;

import atvPOO.dao.Dao;
import atvPOO.dao.PetDao;
import atvPOO.database.Conexao;
import atvPOO.model.Pet;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //chama a conexão
        Connection conn = Conexao.getConnection();

        if(conn != null){
            System.out.println("Conectado com sucesso");
        } else{
            System.out.println("Erro ao conectar" );
        }

        //inserir pet
//        Pet gato = new Pet("Mar", "Gato", 1, 2.5, "Francinete", false);
//        PetDao dao = new PetDao();
//        dao.inserir(gato);

        PetDao dao2 = new  PetDao();
        List<Pet> lista = dao2.listar();

        for(Pet pet : lista){
//            System.out.println(pet.getNome());
//            System.out.println(pet.getTipo());
//            System.out.println(pet.getIdade());
//            System.out.println(pet.getPeso());
//            System.out.println(pet.getNome_do_dono());
//            System.out.println(pet.isEstaVacinado());
            System.out.println(pet.apresentar());
        }




    }
}