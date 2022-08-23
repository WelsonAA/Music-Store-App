package com.example.phase2222222;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerShowAllItemsController  {





    @FXML
    private Label artists;

    @FXML
    private Label categories;

    @FXML
    private Label descriptions;
    @FXML
    private Label dates;
    @FXML
    private Label durations;
    @FXML
    private Label passing;
    @FXML
    private Button load;

    @FXML
    private Label names;

    @FXML
    private Label prices;

    @FXML
    private Button returntocustomermenubtn;

        @FXML
        void backToCustomerMenu(MouseEvent event)throws IOException {
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
        @FXML
    void loading(MouseEvent event){
            String Names = "";
            String Prices="";
            String Durations="";
            String Categories="";
            String Descriptions="";
            String Artists="";
            String Dates="";
            for(int i=0;i<Library.getMusical_records().size();i++){
                Names=Names +Library.getMusical_records().get(i).getName()+'\n';
                Durations=Durations+Library.getMusical_records().get(i).getMin()+":"+Library.getMusical_records().get(i).getSec()+'\n';
                Prices=Prices+Library.getMusical_records().get(i).getPrice()+'\n';
                Categories=Categories+Library.getMusical_records().get(i).getCategory()+'\n';
                Artists=Artists+Library.getMusical_records().get(i).getArtist()+'\n';
                Descriptions=Descriptions+Library.getMusical_records().get(i).getDescription()+'\n';
                Dates+=Library.getMusical_records().get(i).getRedate().toString()+'\n';
            }


            names.setText(Names);
            durations.setText(Durations);
            prices.setText(Prices);
            categories.setText(Categories);
            artists.setText(Artists);
            descriptions.setText(Descriptions);
            dates.setText(Dates);
        }




}


