package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import org.example.linkdin.HelloApplication;


public class WelcomePage {
    @FXML
      Label welcome;

    @FXML
      Button SignIn;

    @FXML
      Button SignUp;

    @FXML
    public void handleSignInAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleSignUpAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}