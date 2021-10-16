
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service;


import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Mensaje;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository.RepositorioMensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosMensaje {
    @Autowired
    private RepositorioMensaje  metodosCrud;

    public List<Mensaje > getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Mensaje> getMensaje (int id) {
        return metodosCrud.getMensaje(id);
    }

    public Mensaje save(Mensaje  mensaje) {
        if (mensaje.getIdMessage()== null) {
            return metodosCrud.save(mensaje);
        } else {
            Optional<Mensaje > evt = metodosCrud.getMensaje(mensaje.getIdMessage());
            if (evt.isEmpty()) {
                return metodosCrud.save(mensaje);
            } else {
                return mensaje;
            }

        }

    }
    
}
