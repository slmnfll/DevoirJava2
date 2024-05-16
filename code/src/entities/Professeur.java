package entities;
import views.ProfesseurVue;

import java.util.ArrayList;
import java.util.List;
public class Professeur {
    private static int counter;
    private int id;
    private String nom;
    private String prenom;
    private List<Cour> cours = new ArrayList<>();
    public Professeur(){counter++;}
    public Professeur(String nom, String prenom){
        this.id = ++counter;
        this.nom = nom;
        this.prenom = prenom;
    }
    public static int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public List<Cour> getCours() {
        return cours;
    }
    public void addCour(Cour cour) {
        cours.add(cour);
    }
    @Override
    public String toString() {
        return "Professeur{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }
}
