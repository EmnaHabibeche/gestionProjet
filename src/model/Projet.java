package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projet {
    // Attributes
    private String name;
    private String description;
    private Date deadline;
    private List<Tache> taches;

    // Constructor
    public Projet(String name, String description, Date deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.taches = new ArrayList<>();
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

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    // Method to add a task to the project
    public void addTache(Tache tache) {
        taches.add(tache);
    }

    // Method to remove a task from the project
    public void removeTache(Tache tache) {
        taches.remove(tache);
    }

}

