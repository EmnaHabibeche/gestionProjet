package service;

import model.Projet;

import java.util.List;

public interface ProjetService {
    void addProjet(Projet projet);
    Projet getProjetById(int id);
    List<Projet> getAllProjets();
    void updateProjet(Projet projet);
    void deleteProjet(int id);
}
