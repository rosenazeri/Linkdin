package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import org.example.linkdin.HelloApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WelcomePage {
    @FXML
      Label welcome;

    @FXML
      Button SignIn;

    @FXML
      Button SignUp;

    @FXML
    public void handleSignInAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleSignUpAction(ActionEvent actionEvent) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void replaceTextInFXML(String filename, String oldText, String newText) {
        //change color
        try {
            filename = filename.trim();
            Path filePath = Paths.get(filename);
            if (!Files.exists(filePath)) {
                throw new IOException("File not found: " + filename);
            }
            String content = new String(Files.readAllBytes(filePath));
            content = content.replaceAll(oldText, newText);
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DarkHandler(ActionEvent actionEvent) {
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Hello.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Sign-in.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Sign-up.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home2.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\CertainJob.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\CertainJob2.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Connection.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Connection2.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Education.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Education2.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Post.fxml", "#cec8ff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Profile.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Profile2.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Search.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ShowProfile.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\UserProfiles.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\UserProfiles.fxml", "#cec8ff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ShowProfile.fxml", "#cec8ff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Search.fxml", "#e2dfff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home2.fxml", "#cec8ff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home2.fxml", "#ebe8ff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#cec8ff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#dedeff" , "#3f3fff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#ffffff" , "#000000");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\commentView.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\commentView.fxml", "#dedeff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\commentView.fxml", "#ffffff" , "#000000");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\LikeView.fxml", "#bfb8ff" , "#03001b");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\LikeView.fxml", "#dedeff" , "#4530ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\LikeView.fxml", "#ffffff" , "#000000");

    }
    public void LightHandler(ActionEvent actionEvent) {
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Hello.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Sign-in.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Sign-up.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home2.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\CertainJob.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\CertainJob2.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Connection.fxml" , "#03001b", "#bfb8ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Connection2.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Education.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Education2.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Post.fxml", "#4530ff", "#cec8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Profile.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Profile2.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Search.fxml" , "#03001b", "#bfb8ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ShowProfile.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\UserProfiles.fxml", "#03001b", "#bfb8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\UserProfiles.fxml", "#4530ff", "#cec8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ShowProfile.fxml" , "#4530ff", "#cec8ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Search.fxml", "#4530ff", "#e2dfff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home2.fxml" , "#4530ff", "#cec8ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\Home2.fxml", "#4530ff", "#ebe8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#4530ff", "#cec8ff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#3f3fff", "#dedeff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\ChatRoom.fxml", "#000000", "#ffffff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\commentView.fxml" , "#03001b", "#bfb8ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\commentView.fxml", "#4530ff", "#dedeff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\commentView.fxml" , "#000000", "#ffffff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\LikeView.fxml" , "#03001b", "#bfb8ff");
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\LikeView.fxml", "#4530ff", "#dedeff" );
        replaceTextInFXML("src\\main\\resources\\org\\example\\linkdin\\LikeView.fxml" , "#000000", "#ffffff");

    }
}