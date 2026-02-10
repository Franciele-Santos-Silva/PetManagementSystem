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

        PetDao dao = new  PetDao();

//        Pet gata = new Pet("Mulher do Burro", "Dragão", 5, 1, "Burro", false);
//        dao.inserir(gata);

        Pet pet = new Pet();
        pet.setNome("Marie");
        pet.setTipo("Gata");
        pet.setIdade(2);
        pet.setPeso(3.8);
        pet.setNome_do_dono("Maria");
        pet.setEstaVacinado(true);

        dao.atualizar(1, pet);

        //dao.deletar(4);

        List<Pet> lista = dao.listar();
        for (int i=0;i<lista.size();i++) {
            if (lista.get(i) != null) {
                System.out.println(lista.get(i).apresentar());
            }
        }

    }
}




























