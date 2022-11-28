package com.gyakorlatbeadando;

import com.gyakorlatbeadando.Jelentkezes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "jelentkezo")
public class Jelentkezo {
    @Id
    private int id;
    private String nev;
    private String nem;
    @OneToMany(mappedBy = "jelentkezoid")
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

    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public List<Jelentkezes> getJelentkezesList() {
        return jelentkezesList;
    }

    public void setJelentkezesList(List<Jelentkezes> jelentkezesList) {
        this.jelentkezesList = jelentkezesList;
    }
}
