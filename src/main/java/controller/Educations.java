package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.linkdin.HelloApplication;

import java.io.IOException;

public class Educations {
    User user;
    @FXML
    Button back;

    @FXML
    Label academyLabel;

    @FXML
    TextField academy;

    @FXML
    Label fieldLabel;

    @FXML
    TextField field;

    @FXML
    Label startEducationLabel;

    @FXML
    DatePicker startEducation;

    @FXML
    Label finishEducationLabel;

    @FXML
    DatePicker finishEducation;

    @FXML
    Label gradeLabel;

    @FXML
    TextField grade;

    @FXML
    Label activitiesLabel;

    @FXML
    TextArea activities;

    @FXML
    Button next;

    @FXML
    private void initialize() {
        // Initialization code goes here
    }

    @FXML
    private void handleBackButtonAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleNextButtonAction(ActionEvent actionEvent) {
        if (academy.getText().length() > 40){
            academy.setStyle("-fx-border-color: red;");
            return;
        }
        if (field.getText().length() > 40){
            field.setStyle("-fx-border-color: red;");
            return;
        }
        float gradeF = Float.parseFloat(String.valueOf(grade));
        if ( gradeF > 20 || gradeF < 0){
            grade.setStyle("-fx-border-color: red;");
            return;
        }
        if (activities.getText().length() > 500){
            activities.setStyle("-fx-border-color: red;");
            return;
        }
        if (startEducation == null) {
            startEducation.setStyle("-fx-border-color: red;");
            return;
        }
        if (finishEducation == null) {
            finishEducation.setStyle("-fx-border-color: red;");
            return;
        }

        setUser(user);

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CertainJob2.fxml"));
            AnchorPane EducationsPage = loader.load();
            Educations2 controller = loader.getController();
            controller.setUser(user);
            Stage stage = (Stage) next.getScene().getWindow();
            Scene scene = new Scene(EducationsPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setUser(User user) {
        this.user = user;
        academy.setText(user.getEducation().getAcademy());
        field.setText(user.getEducation().getField());
        startEducation.setValue(user.getEducation().getStartingEdu());
        finishEducation.setValue(user.getEducation().getFinishingEdu());
        grade.setText(user.getEducation().getGrade());
        activities.textProperty().addListener((observable, oldValue, newValue) -> {
           user.getEducation().setActivities(newValue);
        });
    }

}
