package com.digitalgarage.GD.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Role")
public class Role implements Serializable {
    public Role(int idRole, String nameRole, List<User> users, List<Permission> permissions) {
        this.idRole = idRole;
        this.nameRole = nameRole;
        this.users = users;
        this.permissions = permissions;
    }

    public int getIdRole() {
        return idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRole", nullable = false)
    private int idRole;

    @Column(name = "Nombre", nullable = false)
    private String nameRole;


    @Fetch(value = FetchMode.SUBSELECT)
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<User> users;


    @Fetch(value = FetchMode.SUBSELECT)
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Permission> permissions;

}
