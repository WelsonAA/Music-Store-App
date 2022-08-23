package com.example.phase2222222;

import java.time.LocalDate;

class Musical_Record implements Comparable<Musical_Record>{

    private int min;
    private int sec;
    private String name;

    private double price;

    private  Artist artist;
    private Category category;
    private int stock;
    private int no_of_sold_items;
    private LocalDate redate;
    Artist getArtistO() {
        return artist;
    }


    private String description ;

    public LocalDate getRedate() {
        return redate;
    }




        Musical_Record(String name, int min, int sec,   Double price,  String artist, String str, String category, int stock, int no_of_sold_items,LocalDate date){
            this.redate= date;
            this.min = min;
            this.sec = sec;
            this.name = name;
            this.price = price;
            for(int i=0;i<Library.getArtists().size();i++)
            {
                if(artist.equals(Library.getArtists().get(i).getName()))
                {
                    this.artist=Library.getArtists().get(i);
                }
            }
            for (int i = 0; i < Library.getCategories().size(); i++) {
                if (category.equals(Library.getCategories().get(i).getName())) {

                    this.category= Library.getCategories().get(i);
                }
            }

        this.description = str;
        this.stock = stock;
        this.no_of_sold_items = no_of_sold_items;
    }

    Musical_Record(String name, int min, int sec,   Double price,  Artist artist, String str, Category category, int stock, int no_of_sold_items,String date) {
         this.redate= LocalDate.parse(date);
        this.min = min;
        this.sec = sec;
        this.name = name;
        this.price = price;
        this.category=category;
        this.artist=artist;
        this.description = str;
        this.stock = stock;
        this.no_of_sold_items = no_of_sold_items;
    }


    double getPrice() {
        return price;
    }

    String getDescription() {
        return description;
    }
    void setDescription(String d) {
        getDescription();
        this.description = d;
    }

    @Override
    public String toString(){
        return "Musical Record: " + name +"   "+  "Duration: " + min +":"+ sec  +"   "  + "Price: $" + price + "   "+ "Category: " + category.getName() +"   "+ "Description: " + description+"   " +  "Artist: " +artist.getName() + '\n';
    }



    @Override
    public int compareTo(Musical_Record o) {
        if(this.getMin()>o.getMin()){
            return 1;
        }
        else if(getMin()<o.getMin()){
            return -1;
        }
        else if(getMin()==o.getMin()){
            if(getSec()>o.getSec()){
                return 1;
            }
            else if(getSec()<o.getSec()){
                return -1;
            }
            else
                return 0;
        }
        else return 0;
    }


    Category getCategoryO() {
        return category;
    }
    String getCategory(){return category.getName();}
    String getArtist(){return artist.getName();}
    int getMin() {
        return min;
    }


    int getSec() {
        return sec;
    }


    String getName() {
        return name;
    }




public boolean equals(Musical_Record mus){
        return mus.getName().equals(this.name);
}

    int getStock() {
        return stock;
    }


    int getNo_of_sold_items() {
        return no_of_sold_items;
    }

    void selling(){
        this.no_of_sold_items+=1;
        stock-=1;
    }
    void returning(){
        this.no_of_sold_items-=1;
        stock+=1;
    }


}
