package angelomoreno.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private UUID location_id;
    private String nome;
    private String city;

    public Location(){};

    public Location(String nome, String city) {
        this.nome = nome;
        this.city = city;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UUID getLocation_id() {
        return location_id;
    }

    @Override
    public String toString() {
        return "Location{" +
                "location_id=" + location_id +
                ", nome='" + nome + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
