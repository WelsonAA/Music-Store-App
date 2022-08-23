package com.example.phase2222222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerSearchItemsController {

    @FXML
    private Label artists;
    @FXML
    private Label exceptions;
    @FXML
    private Button byartist;

    @FXML
    private Button bycategory;

    @FXML
    private Button bymusicalrecord;

    @FXML
    private Label categories;

    @FXML
    private Label dates;
    @FXML
    private Label descriptions;

    @FXML
    private Label durations;

    @FXML
    private Label names;

    @FXML
    private Label prices;

    @FXML
    private Button returntocustomermenu;
    @FXML
    private Label passing;

    @FXML
    private TextField searchtext;

    @FXML
    private Label solditems;

    @FXML
    private Label stocks;

    @FXML
    void clearing(MouseEvent event){
        exceptions.setText("");
        names.setText("");
        durations.setText("");
        descriptions.setText("");
        prices.setText("");
        categories.setText("");
        artists.setText("");
        solditems.setText("");
        stocks.setText("");
        dates.setText("");
    }
    @FXML
    void searchmusicalrecord(MouseEvent event){
        clearing(event);
    String searchWord=searchtext.getText();
    String username=passing.getText();
    for(int i=0;i<Library.getCustomers().size();i++){
        if(username.equals(Library.getCustomers().get(i).getUsername())){
            Musical_Record mus=Library.getCustomers().get(i).searchingbymusicalrecord(searchWord);
            try {
                if (mus==null)
                    throw new MusException();
            }
            catch(MusException e) {
                exceptions.setText("Music Not found !");
            }
            names.setText(mus.getName());
            durations.setText(Integer.valueOf(mus.getMin()).toString() +":"+ Integer.valueOf(mus.getSec()).toString());
            prices.setText(Double.valueOf(mus.getPrice()).toString());
            categories.setText(mus.getCategory());
            artists.setText(mus.getArtist());
            stocks.setText(Integer.valueOf(mus.getStock()).toString());
            solditems.setText(Integer.valueOf(mus.getNo_of_sold_items()).toString());
            descriptions.setText(mus.getDescription());
            dates.setText(mus.getRedate().toString());
            break;
        }
    }
    }
    @FXML
    void searchcategory(MouseEvent event){
        clearing(event);
        String searchWord=searchtext.getText();
        String username=passing.getText();
        String Names="";
        String Durations="";
        String Prices="";
        String Categories="";
        String Artists="";
        String Stocks="";
        String SoldItems="";
        String Descriptions="";
        String Dates="";
        for(int i=0;i<Library.getCustomers().size();i++){
            if(username.equals(Library.getCustomers().get(i).getUsername())){
                Category cat = Library.getCustomers().get(i).searchingbycategory(searchWord);
                try {

                    if (cat==null)
                        throw new CatException();
                }
                catch (CatException e) {
                    exceptions.setText("Category Not found !");
                }

                for(int j=0;j<cat.getMusical_records().size();j++){
                Names+=cat.getMusical_records().get(j).getName()+'\n';
                Durations+=Integer.valueOf(cat.getMusical_records().get(j).getMin()).toString() +":"+Integer.valueOf(cat.getMusical_records().get(j).getSec()).toString() + '\n';
                Prices+=Double.valueOf(cat.getMusical_records().get(j).getPrice()).toString()+'\n';
                Categories+= cat.getName()+'\n';
                Artists+=cat.getMusical_records().get(j).getArtist()+'\n';
                Stocks+=Integer.valueOf(cat.getMusical_records().get(j).getStock()).toString()+'\n';
                SoldItems+=Integer.valueOf(cat.getMusical_records().get(j).getNo_of_sold_items()).toString()+'\n';
                Descriptions+=cat.getMusical_records().get(j).getDescription()+'\n';
                Dates+=cat.getMusical_records().get(j).getRedate().toString()+'\n';
                }
                names.setText(Names);
                durations.setText(Durations);
                prices.setText(Prices);
                categories.setText(Categories);
                artists.setText(Artists);
                stocks.setText(Stocks);
                solditems.setText(SoldItems);
                descriptions.setText(Descriptions);
                dates.setText(Dates);
                break;
            }
        }
    }
    @FXML
    void searchartist(MouseEvent event){
        clearing(event);
        String searchWord=searchtext.getText();
        String username=passing.getText();
        String Names="";
        String Durations="";
        String Prices="";
        String Categories="";
        String Artists="";
        String Stocks="";
        String SoldItems="";
        String Descriptions="";
        String Dates="";
        for(int i=0;i<Library.getArtists().size();i++){
            if(username.equals(Library.getCustomers().get(i).getUsername())){

                Artist art=Library.getCustomers().get(i).searchingbyartist(searchWord);
                try {

                    if (art==null)
                        throw new ArtistException();
                }
                catch (ArtistException e) {
                    exceptions.setText("Artist Not found !");

                }


                for(int j=0;j<art.getMusical_records().size();j++){
                    Names+=art.getMusical_records().get(j).getName()+'\n';
                    Durations+=Integer.valueOf(art.getMusical_records().get(j).getMin()).toString() +":"+Integer.valueOf(art.getMusical_records().get(j).getSec()).toString() + '\n';
                    Prices+=Double.valueOf(art.getMusical_records().get(j).getPrice()).toString()+'\n';
                    Categories+= art.getMusical_records().get(j).getCategory()+'\n';
                    Artists+=art.getName()+'\n';
                    Stocks+=Integer.valueOf(art.getMusical_records().get(j).getStock()).toString()+'\n';
                    SoldItems+=Integer.valueOf(art.getMusical_records().get(j).getNo_of_sold_items()).toString()+'\n';
                    Descriptions+=art.getMusical_records().get(j).getDescription()+'\n';
                    Dates+=art.getMusical_records().get(j).getRedate().toString()+'\n';
                }
                names.setText(Names);
                durations.setText(Durations);
                prices.setText(Prices);
                categories.setText(Categories);
                artists.setText(Artists);
                stocks.setText(Stocks);
                solditems.setText(SoldItems);
                descriptions.setText(Descriptions);
                dates.setText(Dates);
                break;
            }
        }
    }
    @FXML
    void returntocustomermenu(MouseEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Customer-afterlogin.fxml"));
        Parent root= loader.load();
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        CustomerAfterLoginController c = loader.getController();
        c.displayName(passing.getText());
        Scene scene=new Scene(root);
        stage.setTitle("Customer Menu");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void displayName (String username) throws IOException{
        passing.setText(username);

    }
}
