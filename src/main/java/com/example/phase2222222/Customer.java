package com.example.phase2222222;


import java.util.*;

class Customer extends Person  {


    Order getOrder() {
        return order;
    }

    private Order order= new Order();



    Customer(String username, String password) {
        super(username, password);
    }

    void addToOrder(Musical_Record mus){

        order.getItems().add(mus);
        mus.selling();
    }
    void addtoOrderS(String searchWord){
        Musical_Record mus=searchingbymusicalrecord(searchWord);

        order.getItems().add(mus);
        mus.selling();
    }


    void deleteFromOrderS(String searchWord) {
        Musical_Record mus = searchingbymusicalrecord(searchWord);
        for(int i=0;i<order.getItems().size();i++){
            if(mus.equals(order.getItems().get(i))){
                order.getItems().remove(i);
            }
        }
        mus.returning();
    }}
