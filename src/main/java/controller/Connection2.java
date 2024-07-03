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

public class Connection2 implements Initializable {
    User user;
    @FXML
    Button back;

    @FXML
    ComboBox birthshow;

    @FXML
    Label showingBirthDateLabel;

    @FXML
    Label connectionLabel;

    @FXML
    TextArea ID;

    @FXML
    Button Done;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        birthshow.getItems().addAll("Only me" , "My followers" , "My connections" , "Everyone");
    }
    public void handleBackButtonAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleDoneButtonAction(ActionEvent actionEvent) {
        if (ID.getText().length() > 40){
            ID.setStyle("-fx-border-color: red;");
            return ;
        }
        initData(user);
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initData(User user) {
        ID.setText(user.getConnection().getOtherConnection());
        birthshow.setItems(user.getConnection().getBirthShow());
    }
}