
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.example.linkdin.HelloApplication;

import javax.xml.stream.events.Comment;

public class CommentView {

    @FXML
      Button back;

    @FXML
      TableColumn<Comment, String> userName;

    @FXML
      TableColumn<Comment, String> comment;

    @FXML
      TableView<Comment> tableView;

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