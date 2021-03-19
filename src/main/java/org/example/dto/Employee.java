package org.example.dto;

import lombok.Data;

public @Data
class Employee {
    private int id;
    private String name;
    private String address;
/*
    Employee() {}

    Employee(String name, String address) {

        this.name = name;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString()
    {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", address='" + this.address + '\'' + '}';
    }
}


 */
}