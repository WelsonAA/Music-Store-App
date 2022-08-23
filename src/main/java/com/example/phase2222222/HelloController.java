package com.example.phase2222222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private Button loginbutton;

    @FXML
    private Label passwordlbl;

    @FXML
    private PasswordField passwordpsdfld;

    @FXML
    private Label usernamelbl;

    @FXML
    private TextField usernametxtfld;

    @FXML
    private Label welcomeText;

    @FXML
    void loginrequest(MouseEvent event) throws IOException{

        String username=usernametxtfld.getText();

        String password= passwordpsdfld.getText();
        try {
            if (Library.check(username, password) instanceof Customer) {
                welcomeText.setText("Login Successful as a Customer!");
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Customer-afterlogin.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                CustomerAfterLoginController c = loader.getController();
                c.displayName(username);
                Scene scene = new Scene(root);
                stage.setTitle("Customer Menu");
                stage.setScene(scene);
                stage.show();
            }
            else if (Library.check(username, password) instanceof Admin) {
                welcomeText.setText("Login Successful as an Admin!");
                Stage stage = (Stage) loginbutton.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("Admin-afterlogin.fxml"));
                stage.setTitle("Admin Menu");
                stage.setScene(new Scene(root));
            }
            else {
                //welcomeText.setText("Wrong Username or Password!");
                throw new wrongInfo();
            }
        }
        catch(wrongInfo e) {
            welcomeText.setText("Wrong usrname or Password!");


        }

        }

    }
