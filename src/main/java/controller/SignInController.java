package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.example.linkdin.HelloApplication;


public class SignInController {
    @FXML
    Button back;
    @FXML
    Button signInButton;
    @FXML
    TextField emailField;
    @FXML
    PasswordField passwordField;
    public void initialize() {
        // Initialization code goes here
    }
    @FXML
    private void handleSignInAction(ActionEvent actionEvent) {
        String email = emailField.getText();
        String password = passwordField.getText();
        User newUser = null;
        for (User user : User.userData) {
            if (user.getEmail().equals(email) || user.getUserName().equals(email)) {
                newUser = user;
                break;
            }
        }
        if (newUser == null) {
            emailField.setStyle("-fx-border-color: red;");
        } else {
            emailField.setStyle("");
            if (!newUser.getPassword().equals(password)) {
                passwordField.setStyle("-fx-border-color: red;");
            } else {
                passwordField.setStyle("");
                HelloApplication m = new HelloApplication();
                    try {
                        m.changeScene(4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
    }
    public void handleBackButtonAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}