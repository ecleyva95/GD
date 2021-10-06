package com.digitalgarage.GD.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="User")
public class User implements Serializable {
    public User(int idUser, String nameUser, String passwordUser, List<Role> roles) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.roles = roles;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser", nullable = false)
    private int idUser;

   @Column(name = "Nombre", nullable = false)
    private String nameUser;

    @Column(name = "Password", nullable = false)
    private String passwordUser;


    @Fetch(value = FetchMode.SUBSELECT)
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Role> roles;

    public int getId() {
        return idUser;
    }

    public void setId(int id) {
        this.idUser = id;
    }
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nombre) {
        this.nameUser = nombre;
    }
}
