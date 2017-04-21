package com.sdajava.jsoncolec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boss {

    private Integer id;
    private String firstName;
    private String lastName;
    //private List<Employee> employees = new ArrayList<>();
    private Map<Integer, List<Employee>> map = new HashMap<Integer, List<Employee>>();

    public Boss(Integer id, String firstName, String lastName,
                Map<Integer, List<Employee>> workers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.map = workers;
    }

   /* public Boss(Integer id, String firstName, String lastName, List<Employee> employees) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employees = employees;
    }*/

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
