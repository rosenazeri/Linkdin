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

public class Connection2 {
    private User user;
    @FXML
    private Button back;

    @FXML
    private ComboBox birthshow;

    @FXML
    private Label showingBirthDateLabel;

    @FXML
    private Label connectionLabel;

    @FXML
    private TextArea ID;

    @FXML
    private Button done;
    public void initialize() {
        birthshow.getItems().addAll("Only me" , "My followers" , "My connections" , "Everyone");
    }
    public void handleBackButtonAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Connection.fxml"));
            AnchorPane Connection2Page = loader.load();
            Stage stage = (Stage) back.getScene().getWindow();
            Scene scene = new Scene(Connection2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleDoneButtonAction(ActionEvent event) {
        if (ID.getText().length() > 40){
            ID.setStyle("-fx-border-color: red;");
            return ;
        }
        initData(user);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile2.fxml"));
            AnchorPane Connection2Page = loader.load();
            Stage stage = (Stage) done.getScene().getWindow();
            Scene scene = new Scene(Connection2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initData(User user) {
        ID.setText(user.getConnection().getOtherConnection());
        birthshow.setItems(user.getConnection().getBirthShow());
    }
}