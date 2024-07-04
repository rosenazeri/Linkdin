package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChatRoom {

    @FXML
    private TextField YourText;

    @FXML
    private VBox leftVBox;

    @FXML
    private VBox centerVBox;

    @FXML
    private Button message;

    // Handle search and display user profile
    @FXML
    private void SearchUserHandler() {
        String searchText = YourText.getText().trim(); // Get text from search TextField

        // Simulate finding user based on searchText
        String username = searchText; // Replace with actual logic to find user

        if (!username.isEmpty()) {
            // Create user profile UI
            VBox userProfileBox = createUserProfile(username);

            // Add user profile to leftVBox
            leftVBox.getChildren().add(userProfileBox);
        }
    }

    // Handle message button click
    @FXML
    private void messageHandler() {
        // Create chat UI for messaging the selected user
        VBox chatBox = createChatBox();

        // Replace center content with chatBox
        centerVBox.getChildren().clear();
        centerVBox.getChildren().add(chatBox);
    }

    // Method to create user profile UI
    private VBox createUserProfile(String username) {
        VBox profileBox = new VBox();
        profileBox.setStyle("-fx-background-color: #dedeff; -fx-padding: 10px;");
        profileBox.setPrefWidth(260);

        // Create profile elements (e.g., image, username label, message button)
        ImageView profileImage = new ImageView(); // You can set image here
        Label usernameLabel = new Label(username);
        Button messageButton = new Button("Message");
        messageButton.setOnAction(event -> messageHandler()); // Handle message button click

        // Add elements to profileBox
        profileBox.getChildren().addAll(profileImage, usernameLabel, messageButton);

        return profileBox;
    }

    // Method to create chat UI
    private VBox createChatBox() {
        VBox chatBox = new VBox();
        chatBox.setStyle("-fx-background-color: #eceaff; -fx-padding: 10px;");
        chatBox.setPrefWidth(700);

        // Create chat elements (e.g., ScrollPane with messages, TextField for typing, Send button)
        ScrollPane messagesScrollPane = new ScrollPane();
        VBox messagesVBox = new VBox(); // This will contain messages
        messagesScrollPane.setContent(messagesVBox);
        messagesScrollPane.setFitToWidth(true);
        messagesScrollPane.setPrefHeight(400);

        TextField messageTextField = new TextField();
        messageTextField.setPromptText("Enter Message...");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(event -> sendMessage(messageTextField.getText(), messagesVBox)); // Handle send button click

        // Add elements to chatBox
        chatBox.getChildren().addAll(messagesScrollPane, new HBox(messageTextField, sendButton));

        return chatBox;
    }

    // Method to handle sending message
    private void sendMessage(String message, VBox messagesVBox) {
        // You can add message handling logic here (e.g., send message to server)

        // Create message UI (e.g., Label with message content)
        Label messageLabel = new Label(message);

        // Add message UI to messagesVBox
        messagesVBox.getChildren().add(messageLabel);

        // Clear messageTextField after sending message
        TextField messageTextField = (TextField) ((HBox) centerVBox.getChildren().get(1)).getChildren().get(0);
        messageTextField.clear();
    }
}