package dao;

import model.Projet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjetDaoImpl implements ProjetDao {


    @Override
    public void addProjet(Projet projet) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO projet (name, description) VALUES (?, ?)")) {
            preparedStatement.setString(1, projet.getName());
            preparedStatement.setString(2, projet.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exception properly in your application
        }
    }

    @Override
    public Projet getProjetById(int id) {
        Projet projet = null;
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM projet WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                projet = new Projet();
                projet.setId(resultSet.getInt("id"));
                projet.setName(resultSet.getString("name"));
                projet.setDescription(resultSet.getString("description"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exception properly in your application
        }
        return projet;
    }

    @Override
    public List<Projet> getAllProjets() {
        return null;
    }

    @Override
    public void deleteProjet(int id) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM projet WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exception properly in your application
        }
    }
    public void updateProjet(Projet projet) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE projet SET name = ?, description = ? WHERE id = ?")) {
            preparedStatement.setString(1, projet.getName());
            preparedStatement.setString(2, projet.getDescription());
            preparedStatement.setInt(3, projet.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exception properly in your application
        }
    }

}

