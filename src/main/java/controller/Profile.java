package controller;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static model.User.isValidImage;

public class Profile {

    @FXML
    private Button back;
    @FXML
    private AnchorPane root;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName ;

    @FXML
    private TextField additionalName;

    @FXML
    private TextField email;

    @FXML
    private Button imageButton;

    @FXML
    private ImageView imageData;

    @FXML
    private Button nextButton;

    @FXML
    private void initialize() {
        // Initialization code goes here
    }

    @FXML
    private void handleImageButtonClick(ActionEvent actionEvent) {
        // Code to handle the image button click event
    }

    @FXML
    private void handleNextButtonClick(ActionEvent actionEvent) {
        String additionalNameText = additionalName.getText();
        if (additionalNameText.length() > 40) {
            additionalName.setStyle("-fx-border-color: red;");
            return;
        }

        Image image = imageData.getImage();
        if (image == null || ((Image) image).isError()) {
            imageData.setStyle("-fx-border-color: red;");
            return;
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);

        try {
            ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
            byte[] imageInBytes = byteArrayOutputStream.toByteArray();

            if (!isValidImage(imageInBytes)) {
                imageData.setStyle("-fx-border-color: red;");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        User user = new User(firstName.getText(), lastName.getText(), additionalName.getText(), email.getText(), null, imageData, null, null, null, null, null, null, null);

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile2.fxml"));
            AnchorPane profilePage;
            profilePage = loader.load();
            Profile2 profile2Controller = loader.getController(); // دریافت کنترلر صفحه Profile2
            profile2Controller.initData(user); // ارسال اطلاعات کاربر به کنترلر صفحه Profile2
            Stage stage = (Stage) nextButton.getScene().getWindow();
            Scene scene = new Scene(profilePage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void backHandler(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            AnchorPane ProfilePage = loader.load();
            Stage stage = (Stage) back.getScene().getWindow();
            Scene scene = new Scene(ProfilePage);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

