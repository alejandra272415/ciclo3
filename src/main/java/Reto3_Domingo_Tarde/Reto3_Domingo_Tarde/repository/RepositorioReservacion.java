/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.interfacee.interfaceCliente;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.interfacee.interfaceReservacion;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Cliente;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Reservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioReservacion {
     @Autowired
    private interfaceReservacion  crud;

    public List<Reservacion> getAll() {
        return (List<Reservacion >) crud.findAll();//Todos los datos d ela tabla
    }
    //no permittir null

    public Optional<Reservacion > getReservacion (int id) {
        return crud.findById(id);
    }

    public Reservacion save(Reservacion  reservacion) {
        return crud.save(reservacion);
    }
}
