package com.example.phase2222222;

import java.util.ArrayList;

class Artist implements Comparable<Artist>{
    private String name;
    private ArrayList<Musical_Record> musical_records = new ArrayList<Musical_Record>();


    String getName() {
        return name;
    }


    ArrayList<Musical_Record> getMusical_records() {
        return musical_records;
    }

    boolean equals(Artist artist){
        if(artist.name.equals(this.name)){return true;}
        else {return false;}
    }
    @Override
    public int compareTo(Artist o) {
        if(getMusical_records().size()>o.getMusical_records().size()){
            return 1;
        }
        else if(getMusical_records().size()<o.getMusical_records().size()){
            return -1;
        }else{
            return 0;}
    }
    @Override
    public String toString () {

        return "Artist name:" + name + '\n' + "Number of Songs: " + musical_records.size() +'\n';
    }
    Artist(String name) {
        this.name = name;
    }
}
