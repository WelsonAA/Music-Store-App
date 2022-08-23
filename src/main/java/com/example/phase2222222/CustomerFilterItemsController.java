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

public class CustomerFilterItemsController {


    @FXML
    private Label artists;

    @FXML
    private Label exceptions;
    @FXML
    private Label categories;

    @FXML
    private Label descriptions;

    @FXML
    private Label durations;

    @FXML
    private Button filtersolditems;

    @FXML
    private Button filterstock;

    @FXML
    private Label names;

    @FXML
    private TextField number;

    @FXML
    private Label passing;

    @FXML
    private Label prices;

    @FXML
    private Button returntocustomermenu;

    @FXML
    private Label solditems;
    @FXML
    private Label dates;
    @FXML
    private Label stocks;
    @FXML
    void filterstock(MouseEvent event){
    String key=number.getText();
        String Names="";
        String Durations="";
        String Prices="";
        String Categories="";
        String Artists="";
        String Stocks="";
        String SoldItems="";
        String Descriptions="";
        String Dates="";
        Integer fkey=Integer.parseInt(key);
    for(int i=0;i<Library.getMusical_records().size();i++){
        if(fkey.equals(Integer.valueOf(Library.getMusical_records().get(i).getStock()))){
        Names+=Library.getMusical_records().get(i).getName()+'\n';
        Durations+=Integer.valueOf(Library.getMusical_records().get(i).getMin()).toString()+":"+Integer.valueOf(Library.getMusical_records().get(i).getSec()).toString()+'\n';
        Prices+=Double.valueOf(Library.getMusical_records().get(i).getPrice()).toString()+'\n';
        Categories+=Library.getMusical_records().get(i).getCategory()+'\n';
        Artists+=Library.getMusical_records().get(i).getArtist()+'\n';
        Stocks+=fkey.toString()+'\n';
        SoldItems+=Integer.valueOf(Library.getMusical_records().get(i).getNo_of_sold_items()).toString()+'\n';
        Descriptions+=Library.getMusical_records().get(i).getDescription()+'\n';
        Dates+=Library.getMusical_records().get(i).getRedate().toString()+'\n';
        }
    }
    try {

        if (Names.equals("") && fkey<0)
            throw new NegativeException(exceptions,exceptions,exceptions,fkey,0,0);

        else if (Names.equals(""))
            throw new StockandSoldException();

    }
    catch (NegativeException e) {

    }

    catch (StockandSoldException e) {
        exceptions.setText("Stock number not found!");


    }
    finally {
        names.setText(Names);
        durations.setText(Durations);
        prices.setText(Prices);
        categories.setText(Categories);
        artists.setText(Artists);
        stocks.setText(Stocks);
        solditems.setText(SoldItems);
        descriptions.setText(Descriptions);
        dates.setText(Dates);
    }
    }
    @FXML
    void filtersold(MouseEvent event){
        String key=number.getText();
        String Names="";
        String Durations="";
        String Prices="";
        String Categories="";
        String Artists="";
        String Stocks="";
        String SoldItems="";
        String Descriptions="";
        String Dates="";
        Integer fkey=Integer.parseInt(key);
        for(int i=0;i<Library.getMusical_records().size();i++){
            if(fkey.equals(Integer.valueOf(Library.getMusical_records().get(i).getNo_of_sold_items()))){
                Names+=Library.getMusical_records().get(i).getName()+'\n';
                Durations+=Integer.valueOf(Library.getMusical_records().get(i).getMin()).toString()+":"+Integer.valueOf(Library.getMusical_records().get(i).getSec()).toString()+'\n';
                Prices+=Double.valueOf(Library.getMusical_records().get(i).getPrice()).toString()+'\n';
                Categories+=Library.getMusical_records().get(i).getCategory()+'\n';
                Artists+=Library.getMusical_records().get(i).getArtist()+'\n';
                Stocks+=Integer.valueOf(Library.getMusical_records().get(i).getStock()).toString()+'\n';
                SoldItems+=fkey.toString()+'\n';
                Descriptions+=Library.getMusical_records().get(i).getDescription()+'\n';
                Dates+=Library.getMusical_records().get(i).getRedate().toString()+'\n';
            }
        }
        try {
            if (Names.equals("") && fkey<0)
                throw new NegativeException(exceptions,exceptions,exceptions,fkey,0,0);

            else if (Names.equals(""))
                throw new StockandSoldException();

        }

        catch (NegativeException e) {

        }

        catch (StockandSoldException e) {
            exceptions.setText("Sold items number not found!");


        }

        finally{
            names.setText(Names);
            durations.setText(Durations);
            prices.setText(Prices);
            categories.setText(Categories);
            artists.setText(Artists);
            stocks.setText(Stocks);
            solditems.setText(SoldItems);
            descriptions.setText(Descriptions);
            dates.setText(Dates);
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
    void displayName (String username) throws IOException {
        passing.setText(username);

    }
}
