package com.kozepiskola;

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
}
