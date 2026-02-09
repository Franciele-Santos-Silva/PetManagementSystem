package atvPOO.dao;

import atvPOO.model.Pet;

import java.util.List;

public interface Dao {

    public void inserir(Pet pet);

//    quem implementar essa interface é obrigado a devolver uma lista de Pet
//    List<Pet> listar();
//
//    public void deletar(int id);
//
//    public void atualizar(Pet pet);

}
