package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Home2 {

    @FXML
    ImageView image;

    @FXML
    Label UserName;

    @FXML
    Button follow;

    @FXML
    ImageView ImageMedia;

    @FXML
    Label likesNum;

    @FXML
    Button Like;

    @FXML
    TextField comment;

    @ FXML
    Button send;


    public void FollowHandler() {
        // Handle follow button action
    }

    public void LikeHandler() {
        // Handle like button action

    }

    public void CommentHandler() {
        // Handle comment text field action

    }

    public void ShowCommentHandler(ActionEvent actionEvent) {
    }
}
