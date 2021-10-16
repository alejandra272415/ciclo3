
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.interfacee.interfaceMensaje;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMensaje {
    
    @Autowired
    private interfaceMensaje crud;

    public List<Mensaje> getAll() {
        return (List<Mensaje>) crud.findAll();

    }

    public Optional<Mensaje> getMensaje(int id) {
        return crud.findById(id);
    }

    public Mensaje save(Mensaje mensaje) {
        return crud.save(mensaje);
    }
    
    
}
