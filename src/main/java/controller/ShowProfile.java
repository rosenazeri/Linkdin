package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.linkdin.HelloApplication;

import java.io.IOException;

public class ShowProfile {

    @FXML
     AnchorPane Name;

    @FXML
     ImageView imageView1;

    @FXML
     ImageView imageView2;

    @FXML
     Button editProfile;

    @FXML
     Label NameAndLastname;

    @FXML
     Label biography;

    @FXML
     ListView<Object> listView1;

    @FXML
     Button back;

    @FXML
     TabPane tabPane;

    @FXML
     Tab experiencesTab;

    @FXML
     Tab educationsTab;

    @FXML
     Tab certificatesTab;

    @FXML
     Tab skillsTab;

    @FXML
     Tab companiesTab;

    public void initialize() {
        // Add initialization logic here
    }

    public void backHandler(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EditProfileHandler(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showingFollowers(ActionEvent actionEvent) {
    }

    public void ShowFollowing(ActionEvent actionEvent) {
    }

    public void ShowConnection(ActionEvent actionEvent) {
    }
}