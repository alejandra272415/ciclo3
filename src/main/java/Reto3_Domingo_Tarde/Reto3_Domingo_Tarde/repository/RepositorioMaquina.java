/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.interfacee.interfaceMaquina;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Maquina;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class RepositorioMaquina {

    @Autowired
    private interfaceMaquina crud;

    public List<Maquina> getAll() {
        return (List<Maquina>) crud.findAll();//Todos los datos d ela tabla
    }
    //no permittir null

    public Optional<Maquina> getMaquina(int id) {
        return crud.findById(id);
    }

    public Maquina save(Maquina maquina) {
        return crud.save(maquina);
    }

}
