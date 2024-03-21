package model;

import java.util.Date;

public class Tache {
    // Attributes
    private String name;
    private String description;
    private Date deadline;
    private boolean completed;

    // Constructor
    public Tache(String name, String description, Date deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.completed = false; // Initially not completed
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Other methods as needed
}