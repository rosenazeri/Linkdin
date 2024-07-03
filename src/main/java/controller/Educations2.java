package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import org.example.linkdin.HelloApplication;

import java.io.IOException;

public class Educations2 {
    User user;
    @FXML
    Button Back;

    @FXML
    Label Explanation;

    @FXML
    TextArea ExtraExplanation;

    @FXML
    TextField s1;

    @FXML
    TextField s2;

    @FXML
    TextField s3;

    @FXML
    TextField s4;

    @FXML
    TextField s5;

    @FXML
    Button Done;
    @FXML
    private void initialize() {
        // Initialization code goes here
    }
    @FXML
    private void handleDoneButtonAction(ActionEvent actionEvent) {
        if (ExtraExplanation.getText().length() > 1000){
            ExtraExplanation.setStyle("-fx-border-color: red;");
            return ;
        }
        if (s1.getText().length() >40){
            s1.setStyle("-fx-border-color: red;");
            return ;
        }
        if (s2.getText().length() >40){
            s2.setStyle("-fx-border-color: red;");
            return ;
        }
        if (s3.getText().length() >40){
            s3.setStyle("-fx-border-color: red;");
            return ;
        }
        if (s4.getText().length() >40){
            s4.setStyle("-fx-border-color: red;");
            return ;
        }
        if (s5.getText().length() >40){
            s5.setStyle("-fx-border-color: red;");
            return ;
        }

        setUser(user);

        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBackButtonAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUser(User user) {
        this.user = user;
        ExtraExplanation.textProperty().addListener((observable, oldValue, newValue) -> {
            user.getEducation().setExtraExplanation(newValue);
        });
        s1.setText(user.getJob().getSkills().getS1());
        s2.setText(user.getJob().getSkills().getS2());
        s3.setText(user.getJob().getSkills().getS3());
        s4.setText(user.getJob().getSkills().getS4());
        s5.setText(user.getJob().getSkills().getS5());
    }
}


