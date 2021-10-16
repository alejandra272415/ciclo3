package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;

@Entity
@Table(name = "message")
public class Mensaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    @JsonIgnoreProperties({"mensajes"})
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "maquinaId")
    @JsonIgnoreProperties({"mensajes"})
    private Maquina maquina;

    //maquin-categoria
    //cliente
//    @ManyToOne
//    @JoinColumn(name="id")
//    @JsonIgnoreProperties({"messages","reservations"})
//    private Maquina maquina;
//
//    @ManyToOne
//    @JoinColumn(name="idClient")
//    @JsonIgnoreProperties({"messages","reservations"})
//    private IntegrationProperties.RSocket.Client client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

}
