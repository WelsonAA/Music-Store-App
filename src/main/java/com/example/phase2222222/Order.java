package com.example.phase2222222;
import java.util.*;
class Order implements Comparable<Order> {
    private ArrayList<Musical_Record> items = new ArrayList<Musical_Record>();


    ArrayList<Musical_Record> getItems() {
        return items;
    }

    @Override
    public int compareTo(Order o) {
        if(CalcBill()>o.CalcBill()){
            return 1;
        }
        else if(CalcBill()<o.CalcBill()){
            return -1;
        }else{
            return 0;}
    }


    double CalcBill(){
        double Bill=0.0;
        for(int i=0;i<items.size();i++){
            Bill+= items.get(i).getPrice();
        }
        return Bill;
    }
    Double CalcBillD(){
        Double Bill=0.0;
        for(int i=0;i<items.size();i++){
            Bill+= items.get(i).getPrice();
        }
        return Bill;
    }
    public String toString () {
        return "Order: " + items.toString() + '\n' + "Number of Items: " + items.size() +'\n';
    }

}
