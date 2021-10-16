
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Cliente;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Maquina;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository.RepositorioCliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosCliente {
    @Autowired
    private RepositorioCliente metodosCrud;

    public List<Cliente > getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Cliente > getCliente (int id) {
        return metodosCrud.getCliente (id);
    }

    public Cliente save(Cliente cliente) {
        if (cliente.getIdClient()== null) {
            return metodosCrud.save(cliente);
        } else {
            Optional<Cliente> evt = metodosCrud.getCliente(cliente.getIdClient());
            if (evt.isEmpty()) {
                return metodosCrud.save(cliente);
            } else {
                return cliente;
            }

        }

    }
    
}
