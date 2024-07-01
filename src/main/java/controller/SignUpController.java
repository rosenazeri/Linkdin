package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;
import javafx.fxml.FXML;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static model.User.isValidEmail;
import static model.User.isValidPassword;

public class SignUpController {
    @FXML private TextField firstName;
    @FXML private TextField lastName;
    @FXML private TextField email;
    @FXML private PasswordField password1;
    @FXML private PasswordField password2;
    @FXML private Label firstname;
    @FXML private Button done;

    private List<User> userData = new ArrayList<>();

    @FXML
    public void initialize() {
        // Initialization code here
    }

    @FXML
    public void handleDone(ActionEvent event) {
        if (!isValidInput()) {
            // Show error message to the user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setHeaderText("Please correct the following errors:");

            StringBuilder errorMessage = new StringBuilder();
            if (firstName.getText().isEmpty() || firstName.getText().length() > 20) {
                errorMessage.append("First Name must not be empty and should be less than 20 characters.\n");
            }
            if (lastName.getText().isEmpty() || lastName.getText().length() > 40) {
                errorMessage.append("Last Name must not be empty and should be less than 40 characters.\n");
            }
            if (email.getText().isEmpty() || !isValidEmail(email.getText())) {
                errorMessage.append("Email address is not valid.\n");
            }
            if (password1.getText().isEmpty() || !isValidPassword(password1.getText())) {
                errorMessage.append("Password is invalid.\n");
            }
            if (!password1.getText().equals(password2.getText()) || password2.getText().isEmpty()) {
                errorMessage.append("Passwords do not match or are empty.\n");
            }

            alert.setContentText(errorMessage.toString());
            alert.show();
        } else {
            User user = new User(firstName.getText(), lastName.getText(), null, email.getText(), password1.getText(), null
                    , null, null, null, null, null, null, null);

            boolean isDuplicateEmail = false;
            for (User existingUser : userData) {
                if (existingUser.getEmail().equals(user.getEmail())) {
                    isDuplicateEmail = true;
                    break;
                }
            }
            if (isDuplicateEmail) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Duplicate Email");
                alert.setHeaderText("Email address is already in use.");
                alert.setContentText("Please use a different email address.");
                alert.show();
            } else {
                userData.add(user);
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
                    AnchorPane signUpPage = loader.load();
                    Stage stage = (Stage) done.getScene().getWindow();
                    Scene scene = new Scene(signUpPage);
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private boolean isValidInput() {
        if (firstName.getText().isEmpty()) {
            firstName.setStyle("-fx-border-color: red;");
            return false;
        }
        if (firstName.getText().length() > 20) {
            firstname.setStyle("-fx-border-color: red;");
            return false;
        }
        if (lastName.getText().isEmpty()) {
            lastName.setStyle("-fx-border-color: red;");
            return false;
        }
        if (lastName.getText().length() > 40) {
            lastName.setStyle("-fx-border-color: red;");
            return false;
        }
        if (email.getText().isEmpty()) {
            email.setStyle("-fx-border-color: red;");
            return false;
        }
        if (!isValidEmail(email.getText())) {
            email.setStyle("-fx-border-color: red;");
            return false;
        }
        if (password1.getText().isEmpty() ) {
           password1.setStyle("-fx-border-color: red;");
            return false;
        }
        if (!isValidPassword(password1.getText())) {
            password1.setStyle("-fx-border-color: red;");
            return false;
        }
        if (!(password1.getText().equals(password2.getText()))) {
            password2.setStyle("-fx-border-color: red;");
            return false;
        }
        if (password2.getText().isEmpty()) {
            password2.setStyle("-fx-border-color: red;");
            return false;
        }
        return true;
    }
}