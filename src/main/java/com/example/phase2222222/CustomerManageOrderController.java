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

public class CustomerManageOrderController {


    @FXML
    private Button add;

    @FXML
    private Button calculatebill;

    @FXML
    private TextField cardno;

    @FXML
    private PasswordField cvv;

    @FXML
    private Button delete;

    @FXML
    private Button load;

    @FXML
    private Label names;

    @FXML
    private Label passing;

    @FXML
    private Button pay;
    @FXML
    private Label exceptions;
    @FXML
    private Label prices;

    @FXML
    private Button returntocustomermenu;

    @FXML
    private TextField searchforadd;

    @FXML
    private TextField searchfordelete;

    @FXML
    private Label total;
    @FXML
    void load(MouseEvent event){
        String username=passing.getText();
        String Names = "";
        String Prices="";
        for(int i=0;i<Library.getCustomers().size();i++){
            if(Library.getCustomers().get(i).getUsername().equals(username)){
                for(int j=0;j<Library.getCustomers().get(i).getOrder().getItems().size();j++){
                    Names=Names+Library.getCustomers().get(i).getOrder().getItems().get(j).getName()+'\n';
                    Prices=Prices+Library.getCustomers().get(i).getOrder().getItems().get(j).getPrice()+'\n';
                }
            }
        }

        names.setText(Names);
        prices.setText(Prices);
        calculate(event);
    }
    @FXML
    void calculate(MouseEvent event){String username=passing.getText();
        for(int i=0;i<Library.getCustomers().size();i++){
            if(Library.getCustomers().get(i).getUsername().equals(username)){



                total.setText(String.valueOf(Math.round(100.0*Library.getCustomers().get(i).getOrder().CalcBill())/100.0));
                break;
            }
        }
    }
    @FXML
    void add(MouseEvent event){
    String searchWord=searchforadd.getText();
        try {
            if (searchWord.equals(""))
                throw new NoOrderException();
        }
        catch (NoOrderException e) {
            exceptions.setText("No item is entered");
        }

    for(int i=0;i<Library.getCustomers().size();i++){String username=passing.getText();
        if(Library.getCustomers().get(i).getUsername().equals(username)){
            Library.getCustomers().get(i).addtoOrderS(searchWord);
            break;
        }
    }
    load(event);
    searchforadd.clear();
    }
    @FXML
    void delete(MouseEvent event){
        String username=passing.getText();
    String searchWord=searchfordelete.getText();
        try {
            if (searchWord.equals(""))
                throw new NoOrderException();
        }
        catch (NoOrderException e) {
            exceptions.setText("No item is entered");
        }
      //  String username=passing.getText();
        for(int i=0;i<Library.getCustomers().size();i++){
            if(Library.getCustomers().get(i).getUsername().equals(username)){
                Library.getCustomers().get(i).deleteFromOrderS(searchWord);
                break;
            }
        }
        load(event);
        searchfordelete.clear();
    }
    @FXML
    void pay(MouseEvent event){
        String username=passing.getText();
        for(int i=0;i<Library.getCustomers().size();i++){
            if(Library.getCustomers().get(i).getUsername().equals(username)){
                Library.getCustomers().get(i).getOrder().getItems().clear();
                cardno.clear();
                cvv.clear();
                break;

            }
        }
        load(event);
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
