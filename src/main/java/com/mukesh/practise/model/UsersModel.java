package com.mukesh.practise.model;

import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name = "usersmodel")
public class UsersModel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    public UsersModel(){
    }

    public UsersModel(Integer id, String firstName, String lastName) {
        this.id=id;
        this.firstName=firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
