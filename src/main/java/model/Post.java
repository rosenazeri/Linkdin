package model;

import javafx.scene.image.ImageView;

public class Post {
    private String Caption;
    private ImageView Media;
    private String Comment ;
    private int Likes ;

    public Post(String caption, ImageView media, String comment, int likes) {
        Caption = caption;
        Media = media;
        Comment = comment;
        Likes = likes;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public ImageView getMedia() {
        return Media;
    }

    public void setMedia(ImageView media) {
        Media = media;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int likes) {
        Likes = likes;
    }
}
