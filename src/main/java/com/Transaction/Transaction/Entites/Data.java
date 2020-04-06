package com.Transaction.Transaction.Entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "data")
public class Data {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String Nom;
    @Column(unique = false)
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