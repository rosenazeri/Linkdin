package org.example.linkdin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.User;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class HelloApplication extends Application {
    private static Stage stg;
    private static Scene MainMenu;

    @Override
    public void start(Stage stage) {
        try {
            stg = stage;
            stage.setResizable(false);
            MainMenu = new Scene((new FXMLLoader(HelloApplication.class.getResource("Hello.fxml"))).load());
            stg.setScene(MainMenu);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void changeScene(int x) throws IOException {
        if (x == 1)
            stg.setScene(MainMenu);
        else if (x == 2)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Sign-in.fxml"))).load()));
        else if (x == 3)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Sign-up.fxml"))).load()));
        else if (x == 4)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Home.fxml"))).load()));
        else if (x == 5)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Profile.fxml"))).load()));
        else if (x == 6)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Profile2.fxml"))).load()));
        else if (x == 7)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("direct.fxml"))).load()));
        else if (x == 8)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("CertainJob.fxml"))).load()));
        else if (x == 9)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("CertainJob2.fxml"))).load()));
        else if (x == 10)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Connection.fxml"))).load()));
        else if (x == 11)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Connection2.fxml"))).load()));
        else if (x == 12)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Education.fxml"))).load()));
        else if (x == 13)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("Education2.fxml"))).load()));
        else if (x == 14)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("ChatRoom.fxml"))).load()));
        else if (x == 15)
            stg.setScene(new Scene((new FXMLLoader(HelloApplication.class.getResource("ShowProfile.fxml"))).load()));

    }

    public static void main(String[] args) {
        launch();
    }
}