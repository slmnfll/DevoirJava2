package services;
import entities.Professeur;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProfesseurService extends Service<Professeur> {
    private final List<Professeur> professeurs = new ArrayList<>();
    public ProfesseurService(){}
    public ProfesseurService(Scanner scanner){
        this.scanner = scanner;
    }
    @Override
    public void save(Professeur object) {
        professeurs.add(object);
    }
    @Override
    public List<Professeur> show() {
        return professeurs;
    }
    public Professeur find(int id){
        for (Professeur prof : professeurs) {
            if (prof.getId() == id){
                return prof;
            }
        }
        return null;
    }
}
