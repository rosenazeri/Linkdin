package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class CertainJob {
    private User user;
    @FXML
    private Label Title;
    @FXML
    private Label employmentType;
    @FXML
    private Label company;
    @FXML
    private Label workPlace;
    @FXML
    private Label TypeOfWorkPlace;
    @FXML
    private Label start;
    @FXML
    private Label finish;
    @FXML
    private TextField jobtitleField;
    @FXML
    private ComboBox<String> employmentOption;
    @FXML
    private TextField companyField;
    @FXML
    private TextField workPlaceField;
    @FXML
    private ComboBox<String> workPlaceOption;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private DatePicker endDatePicker;
    @FXML
    private Button nextButton;
    @FXML
    private Button backButton;

    public void initialize() {
        // You can initialize ComboBox options here if needed
        employmentOption.getItems().addAll("full time", "part time", "self employment", "freelance",
                "conventional", "internship", "internship with pay", "seasonal");
        workPlaceOption.getItems().addAll("in place" , "hybrid" , "remote");
    }

    @FXML
    private void NextButtonClicked(ActionEvent event) {
        initialize();
        if (jobtitleField.getText().length() > 40){
            jobtitleField.setStyle("-fx-border-color: red;");
            return ;
        }
        if (companyField.getText().length() > 40){
            companyField.setStyle("-fx-border-color: red;");
            return ;
        }
        if (workPlaceField.getText().length() > 40){
            workPlaceField.setStyle("-fx-border-color: red;");
            return ;
        }
        if (startDatePicker == null) {
            startDatePicker.setStyle("-fx-border-color: red;");
            return;
        }
        if (endDatePicker == null) {
            endDatePicker.setStyle("-fx-border-color: red;");
            return;
        }

        setUser(user);

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CertainJob2.fxml"));
            AnchorPane CertainJobPage = loader.load();
            CertainJob2 controller = loader.getController();
            controller.setUser(user);
            Stage stage = (Stage) nextButton.getScene().getWindow();
            Scene scene = new Scene(CertainJobPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void BackButtonClicked(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile2.fxml"));
            AnchorPane CertainJobPage = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            Scene scene = new Scene(CertainJobPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setUser(User user) {
        this.user = user;
        jobtitleField.setText(user.getJob().getTitle());
        employmentOption.setItems(user.getJob().getEmployment());
        companyField.setText(user.getJob().getCompany());
        workPlaceField.setText(user.getJob().getWorkPlace());
        workPlaceOption.setItems(user.getJob().getWorkPlaceType());
        startDatePicker.setValue(user.getJob().getStartWorking());
        endDatePicker.setValue(user.getJob().getFinishedWorking());
    }
}