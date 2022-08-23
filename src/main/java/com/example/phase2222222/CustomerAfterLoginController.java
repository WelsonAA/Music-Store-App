package com.example.phase2222222;
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

public class CustomerAfterLoginController {
        @FXML
        private Button filteritemsbtn;

        @FXML
        private Button manageorderbtn;
        @FXML
        private Label pasing;
        @FXML
        private Button searchitemsbtn;

        @FXML
        private Button showallitemsbtn;
        @FXML
        private Button logoutbtn;
        @FXML
         void logOut(MouseEvent event)throws IOException {
                Stage stage = (Stage)logoutbtn.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                stage.setTitle("Login Page");
                stage.setScene(new Scene(root));
        }
        @FXML
        void manageOrder(MouseEvent event)throws IOException{

                FXMLLoader loader = new FXMLLoader(getClass().getResource("Customer-manageorder.fxml"));
                Parent root= loader.load();
                Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                CustomerManageOrderController c = loader.getController();
                c.displayName(pasing.getText());

                Scene scene=new Scene(root);
                stage.setTitle("Manage Order");
                stage.setMaximized(true);
                stage.setScene(scene);
                stage.show();

        }

        @FXML
        void searchItem(MouseEvent event)throws IOException{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Customer-searchitems.fxml"));
                Parent root= loader.load();
                Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                CustomerSearchItemsController c = loader.getController();
                c.displayName(pasing.getText());
                Scene scene=new Scene(root);
                stage.setTitle("Search for an item");
                stage.setMaximized(true);
                stage.setScene(scene);
                stage.show();
        }
        @FXML
        void showAllItems(MouseEvent event)throws IOException{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Customer-showallitems.fxml"));
                Parent root= loader.load();
                Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                CustomerShowAllItemsController c = loader.getController();
                c.displayName(pasing.getText());
                stage.setMaximized(true);
                Scene scene=new Scene(root);
                stage.setTitle("Catalogue");
                stage.setScene(scene);
                stage.show();
        }
        @FXML
        void filterItems(MouseEvent event)throws IOException{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Customer-filteritems.fxml"));
                Parent root= loader.load();
                Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                CustomerFilterItemsController c = loader.getController();
                c.displayName(pasing.getText());
                stage.setMaximized(true);
                Scene scene=new Scene(root);
                stage.setTitle("Filter Items");
                stage.setScene(scene);
                stage.show();
        }

        @FXML
        void displayName (String username) throws IOException {
            pasing.setText(username);

        }



}


