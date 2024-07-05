package controller;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import org.example.linkdin.HelloApplication;

public class CommentView {

    @FXML
     Button back;

    @FXML
     ImageView Profile;

    @FXML
     Label UserName;

    @FXML
     Label Comment;

    @FXML
     VBox vboxContainer;

    @FXML
    public void handleBackButtonAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void addComment(String profileImagePath, String userName, String commentText) {
        // Create new HBox for the comment
        HBox hbox = new HBox();
        hbox.setPrefSize(1010.0, 57.0);
        hbox.setStyle("-fx-background-color: #ffffff;");
        hbox.setPadding(new Insets(5.0, 10.0, 5.0, 10.0));

        // Create ImageView for the profile image
        ImageView profileImage = new ImageView(new Image(profileImagePath));
        profileImage.setFitHeight(47.0);
        profileImage.setFitWidth(49.0);
        profileImage.setPickOnBounds(true);
        profileImage.setPreserveRatio(true);
        HBox.setMargin(profileImage, new Insets(5.0, 5.0, 5.0, 10.0));

        // Create Label for the username
        Label userNameLabel = new Label(userName);
        userNameLabel.setPrefSize(129.0, 15.0);
        userNameLabel.setTextFill(Color.BLUE);
        userNameLabel.setFont(new Font("Lucida Bright", 12));
        HBox.setMargin(userNameLabel, new Insets(20.0, 0.0, 0.0, 10.0));

        // Create Label for the comment
        Label commentLabel = new Label(commentText);
        commentLabel.setPrefSize(752.0, 15.0);
        commentLabel.setTextFill(Color.BLUE);
        commentLabel.setFont(new Font("Lucida Bright", 12.0));
        HBox.setMargin(commentLabel, new Insets(20.0, 0.0, 0.0, 0.0));

        // Add children to HBox
        hbox.getChildren().addAll(profileImage, userNameLabel, commentLabel);

        // Add HBox to the top of VBox
        vboxContainer.getChildren().add(0, hbox);
    }
}