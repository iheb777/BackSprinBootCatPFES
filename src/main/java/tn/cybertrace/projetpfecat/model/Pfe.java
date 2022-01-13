package tn.cybertrace.projetpfecat.model;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Pfe implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String titre;
@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name = "idtype")
@JsonSerialize

private TypePfe typePfe;

    @Override
    public String toString() {
        return "Pfe{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", typePfe=" + typePfe.toString() +
                '}';
    }

    public Pfe(String titre, TypePfe typePfe) {

        this.titre = titre;
        this.typePfe = typePfe;
    }

    public Pfe(int id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public Pfe(String titre) {
        this.titre = titre;
    }

    public Pfe() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
