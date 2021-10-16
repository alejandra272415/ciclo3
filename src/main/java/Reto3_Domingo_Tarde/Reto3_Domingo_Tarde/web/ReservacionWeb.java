
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.web;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Reservacion;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service.ServiciosReservacion;
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
@RequestMapping("/api/Reservation")
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReservacionWeb {
        
     @Autowired
    private ServiciosReservacion servicios;

    @GetMapping("/all")
    public List<Reservacion> getReservacion() {
        return servicios.getAll();

    }
    
    @GetMapping("/{id}")
    public Optional<Reservacion>getReservacion(@PathVariable("id") int id){
        return servicios.getReservacion(id);      
        
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservacion save(@RequestBody Reservacion reservacion){
        return servicios.save(reservacion);
    }
    
}
