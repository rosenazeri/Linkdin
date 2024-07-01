package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class WelcomePage extends Parent {
    @FXML
    private Label welcome;

    @FXML
    private Button signInButton;

    @FXML
    private Button signUpButton;

    public void initialize() {
        // Initialization code goes here
    }

    @FXML
    private void handleSignInAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sign-in.fxml"));
            AnchorPane signInPage = loader.load();
            Stage stage = (Stage) signInButton.getScene().getWindow();
            Scene scene = new Scene(signInPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSignUpAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sign-up.fxml"));
            AnchorPane signUpPage = loader.load();
            Stage stage = (Stage) signUpButton.getScene().getWindow();
            Scene scene = new Scene(signUpPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}