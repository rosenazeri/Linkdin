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

import java.io.IOException;

public class ShowProfile {

    @FXML
    private AnchorPane Name;

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private Button editProfileButton;

    @FXML
    private Label NameAndLastname;

    @FXML
    private Label biography;

    @FXML
    private ListView<Object> listView1;

    @FXML
    private Button backButton;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab experiencesTab;

    @FXML
    private Tab educationsTab;

    @FXML
    private Tab certificatesTab;

    @FXML
    private Tab skillsTab;

    @FXML
    private Tab companiesTab;

    public void initialize() {
        // Add initialization logic here
    }

    public void backHandler(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            AnchorPane showProfilePage = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            Scene scene = new Scene(showProfilePage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void EditProfileHandler(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
            AnchorPane showProfilePage = loader.load();
            Stage stage = (Stage) editProfileButton.getScene().getWindow();
            Scene scene = new Scene(showProfilePage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}