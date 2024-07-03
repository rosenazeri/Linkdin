package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import org.example.linkdin.HelloApplication;

public class Posts{
    @FXML

    TextArea captionTextArea;

    @FXML
    MenuButton Status;

    @FXML
    Button media;

    @FXML
    ImageView photoImageView;

    @FXML
    Button post;

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

    public void statusHandler(ActionEvent actionEvent) {
    }

    // Add other methods as needed for additional functionality
}
