package controller;

import controller.Connection2;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;
import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import org.example.linkdin.HelloApplication;

import java.io.IOException;

public class Connections {
    User user;
    @FXML
    Button back;

    @FXML
    Label configurationLink;

    @FXML
    TextField link;

    @FXML
    Label emailLabel;

    @FXML
    TextField Email;

    @FXML
    Label phoneNumberLabel;

    @FXML
    TextField PhoneNum;
    @FXML
    ComboBox Phonetype;

    @FXML
    TextArea Address;

    @FXML
    DatePicker DateOfBirth;
    @FXML
    Button next;

    @FXML
    private void initialize() {
        Phonetype.getItems().addAll("Cellular phone" , "Home phone" , "Landline phone");
        Email.setText(user.getEmail());
    }

    @FXML
    private void handleBackButtonAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile2.fxml"));
            AnchorPane ConnectionPage = loader.load();
            Connection2 Connection2Controller = loader.getController();
             Connection2Controller.initData(user);
            Stage stage = (Stage) back.getScene().getWindow();
            Scene scene = new Scene(ConnectionPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleNextButtonAction(ActionEvent actionEvent) {
        if (Address.getText().length() > 220){
            Address.setStyle("-fx-border-color: red;");
            return ;
        }
        if (configurationLink.getText().length() > 40){
            configurationLink.setStyle("-fx-border-color: red;");
            return ;
        }
        if (PhoneNum.getText().length() > 40){
            PhoneNum.setStyle("-fx-border-color: red;");
            return ;
        }
        setUser(user);

        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(11);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUser(User user) {
        this.user = user;
        configurationLink.setText(user.getConnection().getConfigurationLink());
        PhoneNum.setText(user.getConnection().getPhoneNum());
        Phonetype.setItems(user.getConnection().getPhoneType());
        Address.setText(user.getConnection().getAddress());
        DateOfBirth.setValue(user.getConnection().getBirth());
    }
}
