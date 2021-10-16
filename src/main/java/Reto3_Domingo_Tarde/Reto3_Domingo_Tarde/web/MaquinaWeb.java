package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.web;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Maquina;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service.serviciosMaquina;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Machine")
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MaquinaWeb {
//    @GetMapping("/holamundo")
//    public String saludar() {
//        return "Hola mundo tutoria";
//    }
    @Autowired
    private serviciosMaquina servicios;

    @GetMapping("/all")
    public List<Maquina> getMaquina() {
        return servicios.getAll();

    }
    
    @GetMapping("/{id}")
    public Optional<Maquina>getMaquina(@PathVariable("id") int id){
        return servicios.getMaquina(id);      
        
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Maquina save(@RequestBody Maquina maquina){
        return servicios.save(maquina);
    }
    
}
