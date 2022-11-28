package com.kozepiskola;

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
}
