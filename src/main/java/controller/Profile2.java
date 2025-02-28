package controller;

import controller.CertainJob;
import controller.Connections;
import controller.Educations;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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
import org.example.linkdin.HelloApplication;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static model.User.isValidBackground;

public class Profile2 {
    User user;
    @FXML
    Button background;
    @FXML
    Button back;
    @FXML
    Button certainJobButton ;

    @FXML
    Button next;

    @FXML
    Button educationButton;
    @FXML
    Button connection;
    @FXML
    ImageView Background ;
    @FXML
    Label Biography ;

    @FXML
    Label countryLabel;

    @FXML
    Label cityLabel;
    @FXML
    TextField BiographyTextField ;
    @FXML
    TextField countryTextField;

    @FXML
    TextField cityTextField;

    @FXML
    Label industryLabel;

    @FXML
    TextField industryTextField;


   private void initialize() {
        // Initialization code goes here
    }
    @FXML
    private void backButtonClicked(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(5);
        } catch (Exception e) {
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
        else
            BiographyTextField.setStyle("");
        if (countryTextField.getText().length() > 60) {
            countryTextField.setStyle("-fx-border-color: red;");
            return;
        }
        else
            countryTextField.setStyle("");
        if (cityTextField.getText().length() > 60) {
            cityTextField.setStyle("-fx-border-color: red;");
            return;
        }
        else
            cityTextField.setStyle("");
        if (industryTextField.getText().length() > 60){
            industryTextField.setStyle("-fx-border-color: red;");
            return ;
        }
        else
            industryLabel.setStyle("");
       Image image = Background.getImage();
        if (image == null || ((Image) image).isError()) {
            background.setStyle("-fx-border-color: red;");
            return;
        }
        else
            background.setStyle("");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);

        try {
            ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
            byte[] imageInBytes = byteArrayOutputStream.toByteArray();

            if (!isValidBackground(imageInBytes)) {
                background.setStyle("-fx-border-color: red;");
                return;
            }
            else
                background.setStyle("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        initData(user);
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void certainJobButtonClicked(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CertainJob.fxml"));
            AnchorPane certainJobPage = loader.load();
            CertainJob controller = loader.getController();
            controller.setUser(user);
            Scene scene = new Scene(certainJobPage);
            Stage currentStage = (Stage) certainJobButton.getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void educationButtonClicked(ActionEvent actionEvent) {
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