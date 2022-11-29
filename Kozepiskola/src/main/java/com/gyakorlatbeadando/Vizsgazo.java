package com.gyakorlatbeadando;

import javax.persistence.*;
@Entity
@Table(name="vizsgazodiak")
public class Vizsgazo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int azon;
    private String nev;
    private String osztaly;

    public Vizsgazo() {
    }

    public Vizsgazo(String nev, String osztaly) {
        this.nev = nev;
        this.osztaly = osztaly;
    }

    public int getAzon() {
        return azon;
    }

    public void setAzon(int azon) {
        this.azon = azon;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getOsztaly() {
        return osztaly;
    }

    public void setOsztaly(String osztaly) {
        this.osztaly = osztaly;
    }
}
