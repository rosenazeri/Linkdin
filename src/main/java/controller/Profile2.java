package controller;

import controller.CertainJob;
import controller.Connections;
import controller.Educations;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.User;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static model.User.isValidBackground;

public class Profile2 {
    private User user;
    @FXML
    private Button backgroundButton;
    @FXML
    private Button backButton;
    @FXML
    private Button certainJobButton ;

    @FXML
    private Button nextButton;

    @FXML
    private Button educationButton;
    @FXML
    private Button connectionButton;
    @FXML
    private ImageView background ;
    @FXML
    private Label Biography ;

    @FXML
    private Label countryLabel;

    @FXML
    private Label cityLabel;
    @FXML
    private TextField BiographyTextField ;
    @FXML
    private TextField countryTextField;

    @FXML
    private TextField cityTextField;

    @FXML
    private Label industryLabel;

    @FXML
    private TextField industryTextField;


    private void initialize() {
        // Initialization code goes here
    }
    @FXML
    private void backButtonClicked(javafx.event.ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
            AnchorPane Profile2Page = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            Scene scene = new Scene(Profile2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void AddBackground(ActionEvent event) {
        // Code to handle the add background button click event
    }
    @FXML
    private void nextButtonClicked(ActionEvent event) {
        if (BiographyTextField.getText().length() > 220) {
           BiographyTextField.setStyle("-fx-border-color: red;");
            return;
        }
        if (countryTextField.getText().length() > 60) {
            countryTextField.setStyle("-fx-border-color: red;");
            return;
        }
        if (cityTextField.getText().length() > 60) {
            cityTextField.setStyle("-fx-border-color: red;");
            return;
        }
        if (industryTextField.getText().length() > 60){
            industryTextField.setStyle("-fx-border-color: red;");
            return ;
        }
       Image image = background.getImage();
        if (image == null || ((Image) image).isError()) {
            background.setStyle("-fx-border-color: red;");
            return;
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);

        try {
            ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
            byte[] imageInBytes = byteArrayOutputStream.toByteArray();

            if (!isValidBackground(imageInBytes)) {
                background.setStyle("-fx-border-color: red;");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        initData(user);

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            AnchorPane profile2Page = loader.load();
            Stage stage = (Stage) nextButton.getScene().getWindow();
            Scene scene = new Scene(profile2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void certainJobButtonClicked(javafx.event.ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CertainJob.fxml"));
            AnchorPane Profile2Page = loader.load();
            CertainJob controller = loader.getController();
            controller.setUser(user);
            Stage stage = (Stage) certainJobButton.getScene().getWindow();
            Scene scene = new Scene(Profile2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void educationButtonClicked(javafx.event.ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Education.fxml"));
            AnchorPane Profile2Page = loader.load();
            Educations controller = loader.getController();
            controller.setUser(user);
            Stage stage = (Stage) educationButton.getScene().getWindow();
            Scene scene = new Scene(Profile2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void connectionButtonClicked(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Connection.fxml"));
            AnchorPane Profile2Page = loader.load();
            Connections controller = loader.getController();
            controller.setUser(user);
            Stage stage = (Stage) certainJobButton.getScene().getWindow();
            Scene scene = new Scene(Profile2Page);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initData(User user) {
        this.user = user;
        BiographyTextField.setText(user.getBiography());
        countryTextField.setText(user.getLocation().getCountry());
        cityTextField.setText(user.getLocation().getCity());
        industryTextField.setText(user.getIndustry());
    }
}