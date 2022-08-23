package com.example.phase2222222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminEditDescriptionController {
@FXML
private Label exceptions;
    @FXML
    private TextField desc;

    @FXML
    private Button editdescription;

    @FXML
    private TextField name;

    @FXML
    private Button returntoadminmenu;

    @FXML
    private Button search;
    @FXML
    void returntoadminmenu(MouseEvent event)throws IOException {
        Stage stage = (Stage)returntoadminmenu.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-afterlogin.fxml"));
        stage.setTitle("Admin Menu");
        stage.setScene(new Scene(root));
    }
    @FXML
    void search(MouseEvent event){
        exceptions.setText("");
        String searchword=name.getText();
        Musical_Record d = Library.getAdmin().searchingbymusicalrecord(searchword);
        try {
            if (d==null)
                throw new MusException();
            else
                desc.setText(Library.getAdmin().searchingbymusicalrecord(searchword).getDescription());
        }
        catch (MusException e) {

            exceptions.setText("Music Not Found!");
        }

    }
    @FXML
    void edit(MouseEvent event){
        String searchword=name.getText();
        String newdesc = desc.getText();
        Library.getAdmin().searchingbymusicalrecord(searchword).setDescription(newdesc);

    }
}
