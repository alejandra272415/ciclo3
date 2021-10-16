/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.web;

import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model.Mensaje;
import Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.service.ServiciosMensaje;
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
@RequestMapping("/api/Message")
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MensajeWeb {
    
     @Autowired
    private ServiciosMensaje servicios;

    @GetMapping("/all")
    public List<Mensaje> getMensaje() {
        return servicios.getAll();

    }
    
    @GetMapping("/{id}")
    public Optional<Mensaje>getMensaje(@PathVariable("id") int id){
        return servicios.getMensaje(id);      
        
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje mensaje){
        return servicios.save(mensaje);
    }
    
}
