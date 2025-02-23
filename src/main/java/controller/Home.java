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
import org.example.linkdin.HelloApplication;

import java.io.IOException;

public class Home {
    @FXML
    TextField Search;

    @FXML
    Button message;

    @FXML
    Button profile;

    @FXML
    TabPane tabPane;

    @FXML
    Tab jobs;

    @FXML
    Tab Home;

    @FXML
    Tab Post;

    @FXML
    Tab Notification;

    @FXML
    Tab Network;

    @FXML
    private void initialize() {
        // Initialization logic, if needed
    }

    @FXML
    private void handleProfileButton() {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleMessageButton() {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(14);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
