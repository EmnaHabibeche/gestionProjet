package dao;

import model.Projet;
import java.util.List;

public interface ProjetDao {
    void addProjet(Projet projet);
    Projet getProjetById(int id);
    List<Projet> getAllProjets();
    void updateProjet(Projet projet);
    void deleteProjet(int id);
}
