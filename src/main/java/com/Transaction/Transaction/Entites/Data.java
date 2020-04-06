package com.Transaction.Transaction.Entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Data {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String Nom;
    @Column
    private String Description;

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.Nom;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}