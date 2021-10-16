
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.repository.RepositorioCategoria;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosCategoria {
      
     @Autowired
    private RepositorioCategoria metodosCrud;
    
    public List<Categoria> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Categoria> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    
    public Categoria save(Categoria categoria){
        if(categoria.getIdcategoria()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Categoria> evt=metodosCrud.getCategoria(categoria.getIdcategoria());
            if(evt.isEmpty()){
            return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        
        
        }
    
    }
}
