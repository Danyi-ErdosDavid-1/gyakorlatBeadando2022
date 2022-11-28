package com.gyakorlatbeadando;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "uzenet")
public class Uzenet {
    public Uzenet() {}
    public Uzenet(int id, String content, String date, String name) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.name = name;
    }
    @NotNull
    @Min(2)
    @Id
    private int id;
    @NotNull
    @Size(min=2, max=50)
    private String content;
    private String date;
    private String name;
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
