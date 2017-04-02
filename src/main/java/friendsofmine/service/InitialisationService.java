package friendsofmine.service;

import friendsofmine.domain.Activite;
import friendsofmine.domain.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InitialisationService {

    private ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    private ArrayList<Activite> activites = new ArrayList<>();

    public void initDonnees() {
        initMary();
        initThom();
        initRandonnee();
        initLindyHop();
        initTaekwondo();
    }

    private void initThom() {
        utilisateurs.add(new Utilisateur("Thom", "Thom", "thom@thom.com", "M"));
    }

    private void initMary() {
        utilisateurs.add(new Utilisateur("Mary", "Mary", "mary@mary.com", "F"));
    }

    private void initTaekwondo() {
        activites.add(new Activite("Taekwondo", "le dimanche soir"));
    }

    private void initLindyHop() {
        activites.add(new Activite("Lindy Hop", "le jeudi soir"));
    }

    private void initRandonnee() {
        activites.add(new Activite("Randonnee", "le lundi matin"));
    }

    public ArrayList<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public ArrayList<Activite> getActivites() {
        return activites;
    }

    public void setUtilisateurs(ArrayList<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public void setActivites(ArrayList<Activite> activites) {
        this.activites = activites;
    }
}
