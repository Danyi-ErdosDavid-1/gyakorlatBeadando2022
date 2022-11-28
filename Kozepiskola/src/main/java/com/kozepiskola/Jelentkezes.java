package com.kozepiskola;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jelentkezes")
public class Jelentkezes {
    @Id
    private int id;
    private int sorrend;
    private int szerzett;


}
