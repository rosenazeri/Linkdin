package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class SignInController {
    @FXML
    private Button signInButton;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    public void initialize() {
        // Initialization code goes here
    }
    @FXML
    private void handleSignInAction(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();
        User newUser = null;
        for (User user : User.userData) {
            if (user.getEmail().equals(email)) {
                newUser = user;
                break;
            }
        }
        if (newUser == null) {
            emailField.setStyle("-fx-border-color: red;");
        } else {
            if (!newUser.getPassword().equals(password)) {
                passwordField.setStyle("-fx-border-color: red;");
            } else {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
                    AnchorPane signInPage = loader.load();
                    Stage stage = (Stage) signInButton.getScene().getWindow();
                    Scene scene = new Scene(signInPage);
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}