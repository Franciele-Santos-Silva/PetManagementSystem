package atvPOO.dao;

import atvPOO.model.Pet;

import java.util.List;

public interface Dao {

    public void inserir(Pet pet);

    List<Pet> listar();

}
