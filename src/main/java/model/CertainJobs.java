package model;

import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.time.LocalTime;

public class CertainJobs {
    private String title ;
    private ObservableList<String> employment ;
    private String company ;
    private String workPlace ;
    private ObservableList<String> workPlaceType ;
    private LocalDate startWorking ;
    private LocalDate finishedWorking ;
    private String explanation ;
    private Skills skills ;

    public CertainJobs(String title, ObservableList<String> employment, String company, String workPlace, ObservableList<String> workPlaceType, LocalDate startWorking, LocalDate finishedWorking, String explanation, Skills skills) {
        this.title = title;
        this.employment = employment;
        this.company = company;
        this.workPlace = workPlace;
        this.workPlaceType = workPlaceType;
        this.startWorking = startWorking;
        this.finishedWorking = finishedWorking;
        this.explanation = explanation;
        this.skills = skills;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ObservableList<String> getEmployment() {
        return employment;
    }

    public void setEmployment(ObservableList<String> employment) {
        this.employment = employment;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public ObservableList<String> getWorkPlaceType() {
        return workPlaceType;
    }

    public void setWorkPlaceType(ObservableList<String> workPlaceType) {
        this.workPlaceType = workPlaceType;
    }

    public LocalDate getStartWorking() {
        return startWorking;
    }

    public void setStartWorking(LocalDate startWorking) {
        this.startWorking = startWorking;
    }

    public LocalDate getFinishedWorking() {
        return finishedWorking;
    }

    public void setFinishedWorking(LocalDate finishedWorking) {
        this.finishedWorking = finishedWorking;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Skills getSkills() {
        return skills;
    }
    public void setSkills(Skills skills) {
        this.skills = skills;
    }
}
