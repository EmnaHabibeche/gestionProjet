package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projet {
    // Attributes
    private Integer id;
    private String name;
    private String description;
    private Date deadline;
    private List<Tache> taches;

    // Constructor
    public Projet() {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.taches = new ArrayList<>();
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}

