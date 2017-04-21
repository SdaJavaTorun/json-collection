package com.sdajava.jsoncolec;

import java.util.ArrayList;
import java.util.List;

public class Master {

    private Integer id;
    private String firstName;
    private String lastName;
    private List<Boss> bosses = new ArrayList<>();

    public Master(Integer id, String firstName, String lastName, List<Boss> bosses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bosses = bosses;
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

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }
}
