package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.linkdin.HelloApplication;

import java.io.IOException;

public class Post{
    @FXML
    Button backButton;

    @FXML

    TextArea captionTextArea;

    @FXML
    MenuButton displayStatusMenu;

    @FXML
    Button mediaButton;

    @FXML
    ImageView photoImageView;

    @FXML
    Button postButton;

    @FXML
    private void BackHandler(ActionEvent event) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void mediaHandler(ActionEvent event) {
        // Handle media upload action
    }

    @FXML
    private void postHandler(ActionEvent event) {
        // Handle post creation action
    }

    // Add other methods as needed for additional functionality
}
