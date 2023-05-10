package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //set name as rahul
        //obj.name="Rahul";//this show error as name is private
        //use set and get
        obj.setName("Rahul");
        System.out.print(obj.getName());
    }
}