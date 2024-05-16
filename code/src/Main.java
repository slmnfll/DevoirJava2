import entities.Professeur;
import services.CoursService;
import services.ProfesseurService;
import views.CoursVue;
import views.ProfesseurVue;
import java.util.Scanner;
// Souleymane FALL L2 GLRS A
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choix;

        ProfesseurService professeurService = new ProfesseurService(scanner);
        CoursService coursService = new CoursService(scanner);

        ProfesseurVue professeurVue = new ProfesseurVue(scanner, professeurService);
        CoursVue coursVue = new CoursVue(scanner, coursService);

        do {
            switch(choix = menu(scanner)){
                case 1 -> professeurVue.saisie();
                case 2 -> professeurVue.affiche();
                case 3 -> {
                    Professeur prof = professeurService.find(professeurVue.inputID());
                    if (prof == null) {
                        System.out.println("Le prof n'existe pas.");
                    } else {
                        prof.addCours(coursVue.saisie());
                    }
                }
                case 4 -> coursVue.affiche();
                case 5 -> {
                    Professeur prof = professeurService.find(professeurVue.inputID());
                    if (prof == null) {
                        System.out.println("Le prof n'existe pas.");
                    } else {
                        coursVue.affiche(prof.getCours());
                    }
                }
            }
        } while (choix != 6);
    }

    public static int menu(Scanner scanner){
        System.out.println("1- Ajouter un professeur");
        System.out.println("2- Lister les professeurs");
        System.out.println("3- Créer un cours");
        System.out.println("4- Lister les cours");
        System.out.println("5- Lister les cours d'un professeur");
        System.out.println("6- Quitter");
        return scanner.nextInt();
    }
}