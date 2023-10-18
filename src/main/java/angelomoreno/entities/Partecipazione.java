package angelomoreno.entities;

import angelomoreno.entities.enums.Stato;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue
    private UUID partecipazione_id;

    private Persona persona;
    private Evento evento;
    private Stato stato;

    public Partecipazione(){};
    public Partecipazione(Persona persona, Evento evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public UUID getPartecipazione_id() {
        return partecipazione_id;
    }

    public Persona getPersona() {
        return persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public Stato getStato() {
        return stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "partecipazione_id=" + partecipazione_id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
