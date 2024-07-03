package controller;

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
import java.util.ArrayList;
import java.util.List;

import static model.User.isValidEmail;
import static model.User.isValidPassword;

public class SignUpController {
    @FXML
    TextField firstName;
    @FXML
    TextField lastName;
    @FXML
    TextField email;
    @FXML
    PasswordField password1;
    @FXML
    PasswordField password2;
    @FXML
    Label firstname;
    @FXML
    Button done;

    private List<User> userData = new ArrayList<>();

    @FXML
    public void initialize() {
        // Initialization code here
    }

    @FXML
    public void handleDone(ActionEvent actionEvent) {
        if (!isValidInput()) {

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
                email.setStyle("-fx-border-color: red;");
            } else {
                userData.add(user);
                HelloApplication m = new HelloApplication();
                try {
                    m.changeScene(4);
                } catch (Exception e) {
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