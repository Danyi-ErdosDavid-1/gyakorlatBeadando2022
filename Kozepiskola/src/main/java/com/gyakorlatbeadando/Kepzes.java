package com.gyakorlatbeadando;

import com.gyakorlatbeadando.Jelentkezes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "kepzes")
public class Kepzes {
    @Id
    private int id;
    private String nev;
    private int felveheto;
    private int minimum;
    @OneToMany(mappedBy = "kepzesid")
    private List<Jelentkezes> jelentkezesList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getFelveheto() {
        return felveheto;
    }

    public void setFelveheto(int felveheto) {
        this.felveheto = felveheto;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public List<Jelentkezes> getJelentkezesList() {
        return jelentkezesList;
    }

    public void setJelentkezesList(List<Jelentkezes> jelentkezesList) {
        this.jelentkezesList = jelentkezesList;
    }
}
