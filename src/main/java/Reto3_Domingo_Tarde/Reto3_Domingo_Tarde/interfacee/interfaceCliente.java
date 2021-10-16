
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.interfacee;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface interfaceCliente extends CrudRepository<Cliente, Integer> {
    
}
