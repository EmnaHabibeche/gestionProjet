package model;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    // Attributes
    private String username;
    private String password;
    private List<Badge> badges;

    // Constructor
    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
        this.badges = new ArrayList<>();
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    // Method to earn a badge
    public void earnBadge(Badge badge) {
        badges.add(badge);
    }

    // Other methods as needed
}
