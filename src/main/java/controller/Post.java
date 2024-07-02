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

import java.io.IOException;

public class Post{
    @FXML
    private Button backButton;

    @FXML
    private TextArea captionTextArea;

    @FXML
    private MenuButton displayStatusMenu;

    @FXML
    private Button mediaButton;

    @FXML
    private ImageView photoImageView;

    @FXML
    private Button postButton;

    @FXML
    private void BackHandler(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            AnchorPane PostPage = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            Scene scene = new Scene(PostPage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
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
