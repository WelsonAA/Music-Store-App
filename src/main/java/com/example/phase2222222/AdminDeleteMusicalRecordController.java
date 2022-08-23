package com.example.phase2222222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDeleteMusicalRecordController {
    @FXML
    private Button delete;

    @FXML
    private TextField name;

    @FXML
    private Button returntoadminmenu;
    @FXML
    void returntoadminmenu(MouseEvent event)throws IOException {
        Stage stage = (Stage)returntoadminmenu.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-afterlogin.fxml"));
        stage.setTitle("Admin Menu");
        stage.setScene(new Scene(root));
    }
    @FXML
    void delete(MouseEvent event){
        String searchword=name.getText();
        Library.getAdmin().deleting(Library.getAdmin().searchingbymusicalrecord(searchword));

    }

}
