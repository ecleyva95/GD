package com.digitalgarage.GD.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Permission")
public class Permission implements Serializable {
    public int getIdPermission() {
        return idPermission;
    }

    public String getNamePermission() {
        return namePermission;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setIdPermission(int idPermission) {
        this.idPermission = idPermission;
    }

    public void setNamePermission(String namePermission) {
        this.namePermission = namePermission;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPermission", nullable = false)
    private int idPermission;

    @Column(name = "Nombre", nullable = false)
    private String namePermission;


    @Fetch(value = FetchMode.SUBSELECT)
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Role> roles;


    public Permission(int idPermission, String namePermission, List<Role> roles) {
        this.idPermission = idPermission;
        this.namePermission = namePermission;
        this.roles = roles;
    }
}
