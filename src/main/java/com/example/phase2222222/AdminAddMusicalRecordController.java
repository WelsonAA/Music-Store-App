package com.example.phase2222222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class AdminAddMusicalRecordController {
    @FXML
    private Button add;

    @FXML
    private Label artistexception;

    @FXML
    private Label categoryexception;

    @FXML
    private Label minexception;

    @FXML
    private TextField mrartist;

    @FXML
    private TextField mrcategory;

    @FXML
    private TextField mrdescription;

    @FXML
    private TextField mrmin;

    @FXML
    private TextField mrname;

    @FXML
    private TextField mrnosolditems;

    @FXML
    private TextField mrprice;

    @FXML
    private TextField mrsec;

    @FXML
    private TextField mrstock;

    @FXML
    private Label priceexception;

    @FXML
    private DatePicker redate;

    @FXML
    private Button returntoadminmenubtn;

    @FXML
    private Label secexception;

    @FXML
    private Label solditemexception;

    @FXML
    private Label stockexception;
    @FXML
    void returntoadminmenu(MouseEvent event)throws IOException {
        Stage stage = (Stage)returntoadminmenubtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-afterlogin.fxml"));
        stage.setTitle("Admin Menu");
        stage.setScene(new Scene(root));
    }
    @FXML
    void adding(MouseEvent event){
        solditemexception.setText("");
        secexception.setText("");
        stockexception.setText("");
        priceexception.setText("");
        categoryexception.setText("");
        artistexception.setText("");
        minexception.setText("");
        String name=mrname.getText();
        int min = Integer.parseInt(mrmin.getText());
        int sec = Integer.parseInt(mrsec.getText());
        double price=Double.parseDouble(mrprice.getText());
        int stock=Integer.parseInt(mrstock.getText());
        int nosolditems=Integer.parseInt(mrnosolditems.getText());
        String description =mrdescription.getText();
        String category=mrcategory.getText();
        String artist=mrartist.getText();
        LocalDate date=redate.getValue();
        try {
            Category add =Library.getAdmin().searchingbycategory(category);
            Artist  addart = Library.getAdmin().searchingbyartist(artist);

                if(min>20 || min<0 || sec<0 || sec>60) {
                    throw new TimeException(min, sec, secexception, minexception, event);
                }

                else if (price<0 || stock<0 || nosolditems<0 ) {
                throw new NegativeException(stockexception,priceexception,solditemexception,stock,price,nosolditems);

            }
                else if (add == null) {
                    throw new CatException();
                }
                else if (addart == null) {
                    throw new ArtistException();
                }
            else {
                Library.getAdmin().adding(new Musical_Record(name,min,sec,price,artist,description,category,stock,nosolditems,date));
            }
        }

        catch (TimeException e) {


        }



        catch (NegativeException e) {

        }
        catch (ArtistException e) {
            artistexception.setText("This Artist must be added first!");
        }

        catch (CatException e) {
            categoryexception.setText("This Category must be added first!");
        }




    }
}

