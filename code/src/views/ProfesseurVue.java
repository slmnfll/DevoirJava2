package views;
import entities.Professeur;
import services.ProfesseurService;
import java.util.Scanner;
public class ProfesseurVue extends Vue<Professeur> {
    private ProfesseurService professeurService;
    public ProfesseurVue(){}
    public ProfesseurVue(Scanner scanner, ProfesseurService professeurService){
        this.scanner = scanner;
        this.professeurService = professeurService;
    }
    @Override
    public Professeur saisie() {
        scanner.nextLine();
        professeurService.save(new Professeur(inputString("Entrer le nom:"), inputString("Entrer le prénom:")));
        System.out.println("\nProfesseur ajouté !\n");
        return null;
    }
    @Override
    public void affiche() {
        for(Professeur profs : professeurService.show()){
            System.out.println(profs);
        }
    }
}
