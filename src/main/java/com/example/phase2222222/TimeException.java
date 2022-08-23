package com.example.phase2222222;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class TimeException extends Exception {

    TimeException(int min, int sec, Label label1, Label label2, MouseEvent event) {
        if (sec>60 || sec<0){
            label1.setText("Wrong sec input!");
        }

        if (min>20 || min<0) {

            label2.setText("Wrong min input!");
        }
    }
}
