package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import model.Post;
import org.example.linkdin.HelloApplication;

import java.util.ArrayList;

public class Home2 {
    boolean likeState = false;
    @FXML
    AnchorPane anchorPane;

    @FXML
    ScrollPane scrollPane;

    @FXML
    VBox mainVBox;

    @FXML
     ImageView image;

    @FXML
     Label UserName;

    @FXML
     Button follow;

    @FXML
     ImageView ImageMedia;

    @FXML
     Label Caption;

    @FXML
     Label likesNum;

    @FXML
     Button Like;

    @FXML
     Button ShowLikes;

    @FXML
     TextField comment;

    @FXML
     Button showCM;
    public void addNewPost(String imageUrl, String userName, String caption) {
        ImageView imageView = new ImageView(new Image(imageUrl));
        imageView.setFitWidth(406);
        imageView.setFitHeight(300);

        Label usernameLabel = new Label(userName);
        usernameLabel.setStyle("-fx-text-fill: #1e00ff; -fx-font-size: 15.0; -fx-font-family: 'Lucida Bright';");
        HBox usernameBox = new HBox(usernameLabel);
        usernameBox.setStyle("-fx-background-color: #bfb8ff; -fx-padding: 22px 20px 20px 20px;");

        Button followButton = new Button("Follow");
        followButton.setStyle("-fx-text-fill: #1e00ff; -fx-font-size: 15.0; -fx-font-family: 'Lucida Bright';");
       // followButton.setOnAction(event -> followHandler());  Implement followHandler method
        HBox.setMargin(followButton, new javafx.geometry.Insets(0, 0, 0, 340)); // Adjust margins as needed
        HBox usernameFollowBox = new HBox(usernameBox, followButton);

        Label captionLabel = new Label(caption);
        captionLabel.setStyle("-fx-text-fill: #1e00ff; -fx-font-size: 15.0; -fx-font-family: 'Lucida Bright';");
        captionLabel.setPadding(new javafx.geometry.Insets(7, 40, 7, 40));

        Label likesLabel = new Label("Likes");
        likesLabel.setStyle("-fx-text-fill: #1e00ff; -fx-font-size: 15.0; -fx-font-family: 'Lucida Bright';");
        HBox.setMargin(likesLabel, new javafx.geometry.Insets(10, 470, 0, 0)); // Adjust margins as needed

        Button likeButton = new Button("♥");
        likeButton.setStyle("-fx-text-fill: #ff0000; -fx-font-size: 18.0; -fx-font-family: 'Yu Gothic UI Regular';");
    //    likeButton.setOnAction(event -> likeHandler());  Implement likeHandler method

        TextField commentField = new TextField();
        commentField.setPromptText("Comment");

        Button showCommentButton = new Button("Show");
        showCommentButton.setStyle("-fx-text-fill: #1e00ff; -fx-font-size: 15.0; -fx-font-family: 'Lucida Bright';");
        // showCommentButton.setOnAction(event -> showCommentHandler());  Implement showCommentHandler method

        HBox interactionBox = new HBox(10, likeButton, commentField, showCommentButton);
        interactionBox.setPadding(new javafx.geometry.Insets(5, 40, 20, 40));

        VBox postVBox = new VBox(usernameFollowBox, imageView, captionLabel, likesLabel, interactionBox);
        postVBox.setStyle("-fx-background-color: #ebe8ff;");
        postVBox.setPrefWidth(627);
        postVBox.setMaxWidth(Double.MAX_VALUE);

        mainVBox.getChildren().add(0, postVBox); // Add new post at the top
        Post.addPost(postVBox);
    }

    // Example action methods (implement as needed)
    @FXML
    private void likeHandler(ActionEvent actionEvent) {
        Button likeButton = (Button) anchorPane.lookup("#Like"); // Get the Like button by its ID

        if (!likeState) { // If not liked (blue)
            likeButton.setStyle("-fx-text-fill: #ff0000; -fx-font-size: 18.0; -fx-font-family: 'Yu Gothic UI Regular'; -fx-background-color: red;");
            likeState = true;
        } else { // If already liked (red)
            likeButton.setStyle("-fx-text-fill: #1e00ff; -fx-font-size: 18.0; -fx-font-family: 'Yu Gothic UI Regular'; -fx-background-color: #bfb8ff;");
            likeState = false;
        }
    }

    @FXML
    private void followHandler(ActionEvent actionEvent) {
        // Implement logic for follow button click
    }

    @FXML
    private void showCommentHandler(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(17);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void commentHandler(ActionEvent actionEvent) {

    }

    public void ShowLikesHandler(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(18);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SendHandler(ActionEvent actionEvent) {
    }

    public void NextPostHandler(ActionEvent actionEvent) {
    }
}
