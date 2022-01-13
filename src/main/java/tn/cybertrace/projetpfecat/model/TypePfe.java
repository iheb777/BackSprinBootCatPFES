package tn.cybertrace.projetpfecat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class TypePfe implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idtype;
private String label;

    @Override
    public String toString() {
        return "TypePfe{" +
                "idtype=" + idtype +
                ", label='" + label + '\'' +
                '}';
    }

    public TypePfe(int id, String label) {
        this.idtype = id;
        this.label = label;
    }

    public TypePfe(String label) {
        this.label = label;
    }

    public TypePfe() {

    }

    public int getId() {
        return idtype;
    }

    public void setId(int id) {
        this.idtype = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
