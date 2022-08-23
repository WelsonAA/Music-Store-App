package com.example.phase2222222;

import java.util.*;


final class Library {

    private static final Admin George=new Admin("WelSon03","123456");

    private static ArrayList<Musical_Record> musical_records = new ArrayList<Musical_Record>();
    private static ArrayList<Customer> customers = new ArrayList<Customer>();
    private static ArrayList<Category> categories = new ArrayList<Category>();
    private static ArrayList<Artist> artists =new ArrayList<Artist>();



    static Admin getAdmin(){
        return George;
    }
    static ArrayList<Musical_Record> getMusical_records() {
        return musical_records;
    }

    static ArrayList<Customer> getCustomers() {
        return customers;
    }

    static ArrayList<Category> getCategories() {
        return categories;
    }

    static ArrayList<Artist> getArtists(){ return artists; }

    static Person check(String username, String password){

        Customer cust=new Customer(username, password);

        for(int i=0;i<customers.size();i++){
            if(cust.getUsername().equals(customers.get(i).getUsername())&&cust.getPassword().equals(customers.get(i).getPassword()))
                return cust;
        }
        Admin admin=new Admin(username, password);

            if(admin.getUsername().equals(George.getUsername())&&admin.getPassword().equals(George.getPassword()))
                return admin;

        return null;
    }



}

