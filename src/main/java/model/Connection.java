package model;

import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Connection {
    private String configurationLink;
    private String email;
    private String phoneNum;
    private ObservableList<String> phoneType;
    private String address;
    private LocalDate birth;
    private ObservableList<String> birthShow;
    private String otherConnection;

    public Connection(String configurationLink, String email, String phoneNum, ObservableList<String> phoneType, String address, LocalDate birth, ObservableList<String> birthShow, String otherConnection) {
        this.configurationLink = configurationLink;
        this.email = email;
        this.phoneNum = phoneNum;
        this.phoneType = phoneType;
        this.address = address;
        this.birth = birth;
        this.birthShow = birthShow;
        this.otherConnection = otherConnection;
    }

    public String getConfigurationLink() {
        return configurationLink;
    }

    public void setConfigurationLink(String configurationLink) {
        this.configurationLink = configurationLink;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public ObservableList<String> getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(ObservableList<String> phoneType) {
        this.phoneType = phoneType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public ObservableList<String> getBirthShow() {
        return birthShow;
    }

    public void setBirthShow(ObservableList<String> birthShow) {
        this.birthShow = birthShow;
    }

    public String getOtherConnection() {
        return otherConnection;
    }

    public void setOtherConnection(String otherConnection) {
        this.otherConnection = otherConnection;
    }
}