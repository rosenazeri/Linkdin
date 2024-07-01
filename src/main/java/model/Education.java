package model;

import java.time.LocalDate;

public class Education {
    private String academy ;
    private String field ;
    private LocalDate startingEdu ;
    private LocalDate finishingEdu ;
    private String grade ;
    private String activities ;
    private String extraExplanation ;
    private Skills2 skills ;

    public Education(String academy, String field, LocalDate startingEdu, LocalDate finishingEdu, String grade, String activities, String extraExplanation, Skills2 skills) {
        this.academy = academy;
        this.field = field;
        this.startingEdu = startingEdu;
        this.finishingEdu = finishingEdu;
        this.grade = grade;
        this.activities = activities;
        this.extraExplanation = extraExplanation;
        this.skills = skills;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public LocalDate getStartingEdu() {
        return startingEdu;
    }

    public void setStartingEdu(LocalDate startingEdu) {
        this.startingEdu = startingEdu;
    }

    public LocalDate getFinishingEdu() {
        return finishingEdu;
    }

    public void setFinishingEdu(LocalDate finishingEdu) {
        this.finishingEdu = finishingEdu;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getExtraExplanation() {
        return extraExplanation;
    }

    public void setExtraExplanation(String extraExplanation) {
        this.extraExplanation = extraExplanation;
    }

    public Skills2 getSkills() {
        return skills;
    }

    public void setSkills(Skills2 skills) {
        this.skills = skills;
    }


}
