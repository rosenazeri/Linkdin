package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.example.linkdin.HelloApplication;

public class LikeView {

    @FXML
     Button back;

    @FXML
     TableView<LikeView> tableView;

    @FXML
    private void handleBackButtonAction(ActionEvent event) {
        HelloApplication m = new HelloApplication();
        try {
            m.changeScene(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}