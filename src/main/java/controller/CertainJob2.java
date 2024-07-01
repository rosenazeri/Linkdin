package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CertainJob2 {
    private User user;

    @FXML
    private Button BackButton;

    @FXML
    private TextArea Explanation;

    @FXML
    private TextField s1;

    @FXML
    private TextField s2;

    @FXML
    private TextField s3;

    @FXML
    private TextField s4;

    @FXML
    private TextField s5;

    @FXML
    private Button Done;
    @FXML
    private void initialize() {
        // Initialization code goes here
    }

    @FXML
    private void handleBackButtonAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CertainJob.fxml"));
            AnchorPane CertainJob2Page = loader.load();
            Stage stage = (Stage) BackButton.getScene().getWindow();
            Scene scene = new Scene(CertainJob2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleDoneButtonAction(ActionEvent event) {
        if (Explanation.getText().length() > 1000){
            Explanation.setStyle("-fx-border-color: red;");
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

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile2.fxml"));
            AnchorPane CertainJob2Page = loader.load();
            Stage stage = (Stage) Done.getScene().getWindow();
            Scene scene = new Scene(CertainJob2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setUser(User user) {
        this.user = user;
        Explanation.textProperty().addListener((observable, oldValue, newValue) -> {
            user.getJob().setExplanation(newValue);
        });
        s1.setText(user.getJob().getSkills().getS1());
        s2.setText(user.getJob().getSkills().getS2());
        s3.setText(user.getJob().getSkills().getS3());
        s4.setText(user.getJob().getSkills().getS4());
        s5.setText(user.getJob().getSkills().getS5());
    }
}