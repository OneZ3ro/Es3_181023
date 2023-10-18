package angelomoreno.entities;

import angelomoreno.entities.enums.Sesso;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persone")
public class Persona {
    @Id
    @GeneratedValue
    private UUID persona_id;

    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private Sesso sesso;
    private List<Partecipazione> listaPartecipazioni;

    public Persona(){}
}
