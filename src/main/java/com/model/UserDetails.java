package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
@AllArgsConstructor
public class UserDetails {

    private int id;
    private String name;
    private String lastname;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
