package com.gyakorlatbeadando;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "uzenet")
public class Uzenet {
    public Uzenet() {}
    public Uzenet(int id, String content) {
        this.id = id;
        this.content = content;
    }
    @NotNull
    @Min(2)
    @Id
    private int id;
    @NotNull
    @Size(min=2, max=50)
    private String content;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
