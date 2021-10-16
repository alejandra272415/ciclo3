/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.interfacee.interfaceCliente;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCliente {
    
    @Autowired
    private interfaceCliente crud;

    public List<Cliente> getAll() {
        return (List<Cliente>) crud.findAll();//Todos los datos d ela tabla
    }
    //no permittir null

    public Optional<Cliente> getCliente(int id) {
        return crud.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return crud.save(cliente);
    }
    
}
