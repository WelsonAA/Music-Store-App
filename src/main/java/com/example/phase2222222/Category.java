package com.example.phase2222222;

import java.util.ArrayList;

class Category implements Comparable<Category>{
    private String Name;
    private ArrayList<Musical_Record> musical_records = new ArrayList<Musical_Record>();

    Category(String name)
    {
        this.Name = name;
    }
    public String toString(){

        return "Name: " + this.Name+'\n'+"Musical Records: " + musical_records + '\n';
    }
    String getName()
    {
        return Name;
    }

    boolean equals(Category category){
        if(category.Name.equals(this.Name)){
            return true;
        }
        else return false;
    }


    @Override
    public int compareTo(Category o) {
        if(getMusical_records().size()>o.getMusical_records().size()){
            return 1;
        }
        else if(getMusical_records().size()<o.getMusical_records().size()){
            return -1;
        }else{
            return 0;}
    }

    ArrayList<Musical_Record> getMusical_records()
    {
        return musical_records;
    }


}
