package atvPOO.dao;

import atvPOO.database.Conexao;
import atvPOO.model.Pet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PetDao implements Dao{

    //INSERIR
    @Override
    public void inserir(Pet pet) {
        String sql = """
                insert into pet(nome, tipo, idade, peso, nome_do_dono, estaVacinado ) 
                values (?,?,?,?,?,?);
                """;

        try(Connection conn = Conexao.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pet.getNome());
            stmt.setString(2, pet.getTipo());
            stmt.setInt(3, pet.getIdade());
            stmt.setDouble(4, pet.getPeso());
            stmt.setString(5, pet.getNome_do_dono());
            stmt.setBoolean(6, pet.isEstaVacinado());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir pet: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public List<Pet> listar() {
        return List.of();
    }


//    @Override
//    public List<Pet> listar() {

//        List<Pet> lista = new ArrayList<>();
//
//        String sql = "SELECT * FROM pet";
//
//    }
}
