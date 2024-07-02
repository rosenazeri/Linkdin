package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Home {
    @FXML
    private TextField Search;

    @FXML
    private Button Message;

    @FXML
    private Button Profile;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab jobsTab;

    @FXML
    private Tab HomeTab;

    @FXML
    private Tab PostTab;

    @FXML
    private Tab NotificationTab;

    @FXML
    private Tab NetworkTab;

    @FXML
    private void initialize() {
        // Initialization logic, if needed
    }

    @FXML
    private void handleProfileButton() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ShowProfile.fxml"));
            AnchorPane homePage = loader.load();
            Stage stage = (Stage) Profile.getScene().getWindow();
            Scene scene = new Scene(homePage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleMessageButton() {
        // Handle message button action here
    }
}
