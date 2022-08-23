package com.example.phase2222222;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {



        Admin George = new Admin("WelSon03", "123456");

        Customer Hamza = new Customer("HaMzA", "123456");
        Customer Amr = new Customer("Amr321", "123456");
        Customer Tarek = new Customer("tarek123", "123456");
        Library.getCustomers().add(Amr);
        Library.getCustomers().add(Tarek);
        Library.getCustomers().add(Hamza);


        Artist Ellie_Goulding = new Artist("Ellie Goulding");
        Artist LadyGaga = new Artist("Lady Gaga");
        Artist Eminem = new Artist("Eminem");
        Artist hozier = new Artist("hozier");
        Artist cat = new Artist("Arabian Cat");
        Artist soad = new Artist("System Of A Down");
        Artist fwank = new Artist("Pink Guy");
        Artist ariana = new Artist("Ariana Grande");
        Category pop = new Category("pop");
        Category softRock = new Category("Soft Rock");
        Category Rap = new Category("rap");
        Category metal = new Category("Metal");
        Category indie = new Category("Indie");
        Category indian = new Category("Indian");
        George.adding(indian);
        George.adding(Rap);
        George.adding(pop);
        George.adding(indie);
        George.adding(metal);
        George.adding(softRock);
        George.adding(Ellie_Goulding);
        George.adding(Eminem);
        George.adding(hozier);
        George.adding(LadyGaga);
        George.adding(cat);
        George.adding(soad);
        George.adding(fwank);
        George.adding(ariana);
        Musical_Record mundian = new Musical_Record("Mundian to Bach Ke",4,4,34.5, cat,"mundianTuBachKe ding di ding ding di ding",indian,13,10,"2010-05-19");
        Musical_Record holyMountains = new Musical_Record("Holy Mountains",5,36,20.67,soad,"holyMountains you have noHONOR MURDERER SODOMIZAA",metal,2,12,"2010-06-20");
        Musical_Record nina = new Musical_Record("Nina cried power",5,12,8.42,hozier,"It's not the wall, but what's behind it",softRock,10,3,"2011-06-22");
        Musical_Record badRomance =new Musical_Record("Bad Romance",4,32,12.87,LadyGaga,"badRomancero ro raa aa aaa",pop,5,1,"2010-08-25");
        Musical_Record Love_me_Like_you_do = new Musical_Record("Love me like you do",5,32, 9.88,Ellie_Goulding,"Good Song",pop,25,9,"2012-07-18");
        Musical_Record Till_I_Collapse = new Musical_Record("Till I Collapse",4,13,8.78,Eminem,"Strong",Rap,15,90,"2010-06-30");
        Musical_Record woods = new Musical_Record("In The Woods Somewhere",5,28,13.4,hozier,"darksouls 3 trailer vibes",indie,12,3,"2022-06-13");
        Musical_Record woutme = new Musical_Record("Without me",4,57,34.5,Eminem,"this looks like a job for me",Rap,23,1,"2002-07-19");
        Musical_Record aerials = new Musical_Record("Aerials",3,56,13.0,soad,"nananana neeeigh",metal,2,1,"2010-03-24");
        Musical_Record justdance = new Musical_Record("Just Dance",4,02,9.99,LadyGaga,"ta turu",pop,3,12,"2015-06-20");
        Musical_Record lights = new Musical_Record("Lights",3,33,45.02,Ellie_Goulding,"Cause they're calling, calling, calling me home",pop,12,34,"2019-06-20");
        Musical_Record lonelyday = new Musical_Record("Lonely day",2,51,14.01,soad,"lonelyDay LONELIEST DAY OF MY LIIIFE",softRock,12,3,"2010-06-18");
        Musical_Record intoyou = new Musical_Record("Into You",4,04,23.3,ariana,"a little bit touch ma ba",pop,54,5,"2010-02-25");
        George.adding(holyMountains);
        George.adding(badRomance);
        George.adding(Love_me_Like_you_do);
        George.adding(mundian);
        George.adding(Till_I_Collapse);

        George.adding(lonelyday);
        George.adding(woods);
        George.adding(woutme);
        George.adding(aerials);
        George.adding(justdance);
        George.adding(lights);
        George.adding(intoyou);
        George.adding(nina);
        Amr.addToOrder(aerials);
        Amr.addToOrder(lights);
        Amr.addToOrder(intoyou);
        Amr.addToOrder(badRomance);
        Tarek.addToOrder(mundian);
        Tarek.addToOrder(nina);

        launch();
    }
}





