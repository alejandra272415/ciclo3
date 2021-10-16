
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date starDate;
    private Date devolutionDate;
    private String status;

    //Maquina =categoria{} mensajes[]
    //cliente
   @ManyToOne
    @JoinColumn(name ="clienteId")
    @JsonIgnoreProperties({"reservaciones"})
    private Cliente cliente;
    
    
    @ManyToOne
    @JoinColumn(name = "maquinaId")
    @JsonIgnoreProperties({"reservaciones"})
    private Maquina maquina; 
    
   
   
   
//    @ManyToOne
//    @JoinColumn(name ="id")
//    @JsonIgnoreProperties({"reservations","message"})
//    private Categoria categoria;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    
    
}
