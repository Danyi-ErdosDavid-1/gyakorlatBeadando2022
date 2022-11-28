package com.gyakorlatbeadando;

import javax.persistence.*;

@Entity
@Table(name = "jelentkezes")
public class Jelentkezes {
    @Id
    private int id;
    private int sorrend;
    private int szerzett;
    @ManyToOne
    @JoinColumn(name = "jelentkezoid", referencedColumnName = "id", insertable = false, updatable = false)
    private Jelentkezo jelentkezoid;
    @ManyToOne
    @JoinColumn(name = "kepzesid", referencedColumnName = "id", insertable = false, updatable = false)
    private Kepzes kepzesid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSorrend() {
        return sorrend;
    }

    public void setSorrend(int sorrend) {
        this.sorrend = sorrend;
    }

    public int getSzerzett() {
        return szerzett;
    }

    public void setSzerzett(int szerzett) {
        this.szerzett = szerzett;
    }

    public Jelentkezo getJelentkezoid() {
        return jelentkezoid;
    }

    public void setJelentkezoid(Jelentkezo jelentkezoid) {
        this.jelentkezoid = jelentkezoid;
    }

    public Kepzes getKepzesid() {
        return kepzesid;
    }

    public void setKepzesid(Kepzes kepzesid) {
        this.kepzesid = kepzesid;
    }
}
