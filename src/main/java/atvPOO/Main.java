package atvPOO;

import atvPOO.dao.PetDao;
import atvPOO.database.Conexao;
import atvPOO.model.Pet;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Connection conn = Conexao.getConnection();

        PetDao dao = new  PetDao();

        Pet cachorrinha = new Pet("Fiona", "gatinha", 20, 1, "Sapo", false);
        dao.inserir(cachorrinha);

        Pet pet = new Pet();
        pet.setNome("Marie");
        pet.setTipo("Gata");
        pet.setIdade(2);
        pet.setPeso(3.8);
        pet.setNome_do_dono("Maria");
        pet.setEstaVacinado(true);

//        dao.atualizar(1, pet);
//
//        dao.deletar(4);
//
//        List<Pet> lista = dao.listar();
//        for (int i=0;i<lista.size();i++) {
//            if (lista.get(i) != null) {
//                System.out.println(lista.get(i).apresentar());
//            }
//        }

    }
}




























