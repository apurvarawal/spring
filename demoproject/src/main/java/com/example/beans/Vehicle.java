package com.example.beans;

public class Vehicle {
    private String name;

    public String getName(){
        return name;
    } // whenever this function will be called, it will return the value of 'name' string.

    public void setName(String name){
        this.name = name;
    } // we are making this function, and whenever this function will
    // be called, this will set the 'name' string (private) to that string
}
