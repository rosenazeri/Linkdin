package model;

import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class Post {
    private String caption;
    private ImageView media;
    private String comment;
    private int likes;

    public Post(String caption, ImageView media, String comment, int likes) {
        this.caption = caption;
        this.media = media;
        this.comment = comment;
        this.likes = likes;
    }

    public static ArrayList<VBox> postArrayList = new ArrayList<VBox>();

    // Getters and setters
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public ImageView getMedia() {
        return media;
    }

    public void setMedia(ImageView media) {
        this.media = media;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    // Method to add a new post to the ArrayList
    public static void addPost(VBox post) {
        postArrayList.add(post);
    }

    // Method to get the ArrayList of posts
    public static ArrayList<VBox> getPostArrayList() {
        return postArrayList;
    }
}
