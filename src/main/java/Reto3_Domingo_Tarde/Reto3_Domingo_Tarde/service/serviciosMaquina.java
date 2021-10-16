/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository.RepositorioMaquina;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Maquina;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosMaquina {

    @Autowired
    private RepositorioMaquina metodosCrud;

    public List<Maquina> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Maquina> getMaquina(int id) {
        return metodosCrud.getMaquina(id);
    }

    public Maquina save(Maquina maquina) {
        if (maquina.getId() == null) {
            return metodosCrud.save(maquina);
        } else {
            Optional<Maquina> evt = metodosCrud.getMaquina(maquina.getId());
            if (evt.isEmpty()) {
                return metodosCrud.save(maquina);
            } else {
                return maquina;
            }

        }

    }

}
