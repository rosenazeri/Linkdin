package model;

import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.jar.Attributes;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class User {

    private String firstName;
    private String lastName;
    private String aditionalName;
    private String email;
    private String password;
    private ImageView imageData;
    private ImageView background;
    private String biography;
    private CertainJobs job ;
    private String industry;
    private Education education;
    private Location location;
    private Connection connection ;

    public User(String firstName, String lastName, String aditionalName, String email, String password, ImageView imageData, ImageView background, String biography, CertainJobs job, String industry, Education education, Location location, Connection connection) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.aditionalName = aditionalName;
        this.email = email;
        this.password = password;
        this.imageData = imageData;
        this.background = background;
        this.biography = biography;
        this.job = job;
        this.industry = industry;
        this.education = education;
        this.location = location;
        this.connection = connection;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAditionalName() {
        return aditionalName;
    }

    public void setAditionalName(String aditionalName) {
        aditionalName = aditionalName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ImageView getImageData() {
        return imageData;
    }

    public void setImageData(ImageView imageData) {
        this.imageData = imageData;
    }

    public ImageView getBackground() {
        return background;
    }

    public void setBackground(ImageView background) {
        this.background = background;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public CertainJobs getJob() {
        return job;
    }

    public void setJob(CertainJobs job) {
        this.job = job;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public static ArrayList<User> getUserData() {
        return userData;
    }

    public static void setUserData(ArrayList<User> userData) {
        User.userData = userData;
    }

    public static ArrayList <User> userData = new ArrayList<>();
    public static boolean isValidNameAndLastname(String name){
        return name.matches("[a-zA-Z]+"); }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
    public static boolean isValidPassword(String password){
        return password.matches("^(?=.[0-9])(?=.[a-zA-Z]).{8,}$");
    }
    public static boolean isValidImage(byte[] imageData) {
        // Check if the image is a square with dimensions up to 400x400 pixels and size up to 1 MB
        try {
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageData));
            if (image != null) {
                int width = image.getWidth();
                int height = image.getHeight();
                long imageSizeInBytes = imageData.length;
                long imageSizeInMB = imageSizeInBytes / (1024 * 1024);

                if (width == height && width <= 400 && height <= 400 && imageSizeInMB <= 1) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isValidBackground(byte[] imageData) {
        // Check if the image has dimensions of 1584x396 pixels
        try {
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageData));
            if (image != null) {
                int width = image.getWidth();
                int height = image.getHeight();

                if (width == 1584 && height == 396) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public String toString(){
        return firstName + " " + lastName ;
    }
}
