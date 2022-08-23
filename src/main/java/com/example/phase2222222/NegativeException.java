package com.example.phase2222222;

import javafx.scene.control.Label;

public class NegativeException extends Exception  {
    NegativeException(Label label1, Label label2, Label label3,int stock,double price,int sold) {
        if (stock<0) {
            label1.setText("Number not appropriate");
        }

         if (price<0) {
            label2.setText("Number not appropriate");
        }

        if (sold<0) {
            label3.setText("Number not appropriate");
        }

        }

    }


