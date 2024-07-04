package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;
import javafx.event.ActionEvent;
import org.example.linkdin.HelloApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CertainJob implements Initializable {
     User user;
    @FXML
     Label Title;
    @FXML
     Label employmentType;
    @FXML
     Label company;
    @FXML
     Label workPlace;
    @FXML
     Label TypeOfWorkPlace;
    @FXML
     Label start;
    @FXML
     Label finish;
    @FXML
     TextField jobtitleField;
    @FXML
     ComboBox<String> employmentOption;
    @FXML
     TextField companyField;
    @FXML
     TextField workPlaceField;
    @FXML
     ComboBox<String> workPlaceOption;
    @FXML
     DatePicker startDatePicker;
    @FXML
     DatePicker endDatePicker;
    @FXML
     Button nextButton;
    @FXML
     Button backButton;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // You can initialize ComboBox options here if needed
        employmentOption.getItems().addAll("full time", "part time", "self employment", "freelance",
                "conventional", "internship", "internship with pay", "seasonal");
        workPlaceOption.getItems().addAll("in place" , "hybrid" , "remote");
    }

    @FXML
    private void NextButtonClicked(ActionEvent actionEvent) {
        if (jobtitleField.getText().length() > 40){
            jobtitleField.setStyle("-fx-border-color: red;");
            return ;
        }
        else
            jobtitleField.setStyle("");
        if (companyField.getText().length() > 40){
            companyField.setStyle("-fx-border-color: red;");
            return ;
        }
        else
            companyField.setStyle("");
        if (workPlaceField.getText().length() > 40){
            workPlaceField.setStyle("-fx-border-color: red;");
            return ;
        }
        else
            workPlaceField.setStyle("");
        if (startDatePicker == null) {
            startDatePicker.setStyle("-fx-border-color: red;");
            return;
        }
        else
            startDatePicker.setStyle("");
        if (endDatePicker == null) {
            endDatePicker.setStyle("-fx-border-color: red;");
            return;
        }
        else
            endDatePicker.setStyle("");

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
    private void BackButtonClicked(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(6);
        } catch (Exception e) {
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