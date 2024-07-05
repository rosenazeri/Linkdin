package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.example.linkdin.HelloApplication;

public class LikeView {

    @FXML
    Button back;

    @FXML
     VBox mainVBox;

    @FXML
     ScrollPane scrollPane;

    @FXML
     ImageView Profile;

    @FXML
     Label UserName;

    @FXML
     VBox commentsVBox;

    @FXML
    public void initialize() {
        // Any initialization if needed
    }

    @FXML
    private void handleBackButtonAction() {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addComment(String userName, ImageView profileImage) {
        HBox commentBox = new HBox();
        commentBox.setStyle("-fx-background-color: #ffffff;");
        commentBox.setPrefHeight(58.0);
        commentBox.setPrefWidth(678.0);

        VBox.setMargin(commentBox, new javafx.geometry.Insets(5, 10, 5, 10));

        ImageView imageView = new ImageView();
        imageView.setFitHeight(47.0);
        imageView.setFitWidth(49.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(profileImage.getImage());

        HBox.setMargin(imageView, new javafx.geometry.Insets(5, 5, 5, 10));

        Label nameLabel = new Label(userName);
        nameLabel.setPrefHeight(15.0);
        nameLabel.setPrefWidth(129.0);
        nameLabel.setTextFill(javafx.scene.paint.Color.BLUE);
        nameLabel.setFont(new javafx.scene.text.Font("Lucida Bright", 12.0));

        HBox.setMargin(nameLabel, new javafx.geometry.Insets(20, 0, 0, 40));

        commentBox.getChildren().addAll(imageView, nameLabel);

        commentsVBox.getChildren().add(0, commentBox); // Add the new comment at the top
    }
}