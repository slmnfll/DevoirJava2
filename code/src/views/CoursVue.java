package views;
import entities.Cours;
import services.CoursService;
import java.util.List;
import java.util.Scanner;
public class CoursVue extends Vue<Cours> {
    private CoursService coursService;
    public CoursVue(){}
    public CoursVue(Scanner scanner, CoursService coursService){
        this.scanner = scanner;
        this.coursService = coursService;
    }
    @Override
    public Cours saisie() {
        scanner.nextLine();
        Cours cours = new Cours();
        cours.setDate(formatDate(inputString("Entrer une date (dd-MM-yyyy):")));
        cours.setHeureDB(formatTime(inputString("Entrer une date de début (HH:mm):")));
        cours.setHeureFN(formatTime(inputString("Entrer une date de fin (HH:mm):")));
        coursService.save(cours);
        System.out.println("\nCours ajouté !\n");
        return cours;
    }
    @Override
    public void affiche() {
        for(Cours cours : coursService.show()){
            System.out.println(cours);
        }
    }
    public void affiche(List<Cours> courss) {
        for(Cours cours : courss){
            System.out.println(cours);
        }
    }
}
