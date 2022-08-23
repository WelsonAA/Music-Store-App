package com.example.phase2222222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminAfterLoginController {

    @FXML
    private Button addcategorybtn;

    @FXML
    private Button addmusicalrecordbtn;

    @FXML
    private Button deletecategorybtn;

    @FXML
    private Button deletemusicalrecordbtn;

    @FXML
    private Button editadescriptionbtn;

    @FXML
    private Button logoutbtn;
    @FXML
    void addmusicalrecord(MouseEvent event)throws IOException{
        Stage stage = (Stage)addmusicalrecordbtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-addmusicalrecord.fxml"));
        stage.setTitle("Add a Musical Record");
        stage.setScene(new Scene(root));
    }
    @FXML
    void logOut(MouseEvent event)throws IOException {
        Stage stage = (Stage)logoutbtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Login Page");
        stage.setScene(new Scene(root));
    }
    @FXML
    void deletemusicalrecord(MouseEvent event)throws IOException{
        Stage stage = (Stage)deletemusicalrecordbtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-deletemusicalrecord.fxml"));
        stage.setTitle("Delete a Musical Record");
        stage.setScene(new Scene(root));
    }
    @FXML
    void addcategory(MouseEvent event)throws IOException{
        Stage stage = (Stage)addcategorybtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-addcategory.fxml"));
        stage.setTitle("Add a Category");
        stage.setScene(new Scene(root));
    }
    @FXML
    void deletecategory(MouseEvent event)throws IOException{
        Stage stage = (Stage)deletecategorybtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-deletecategory.fxml"));
        stage.setTitle("Delete a Category");
        stage.setScene(new Scene(root));
    }
    @FXML
    void editdescription(MouseEvent event)throws IOException{
        Stage stage = (Stage)editadescriptionbtn.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Admin-editdescription.fxml"));
        stage.setTitle("Delete a Category");
        stage.setScene(new Scene(root));
    }
}
