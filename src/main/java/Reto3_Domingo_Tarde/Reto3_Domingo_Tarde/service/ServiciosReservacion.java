/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Reservacion;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository.RepositorioReservacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosReservacion {
    @Autowired
    private RepositorioReservacion metodosCrud;

    public List<Reservacion> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Reservacion> getReservacion(int id) {
        return metodosCrud.getReservacion(id);
    }

    public Reservacion save(Reservacion reservacion) {
        if (reservacion.getIdReservation()== null) {
            return metodosCrud.save(reservacion);
        } else {
            Optional<Reservacion> evt = metodosCrud.getReservacion(reservacion.getIdReservation());
            if (evt.isEmpty()) {
                return metodosCrud.save(reservacion);
            } else {
                return reservacion;
            }

        }

    }
    
}
