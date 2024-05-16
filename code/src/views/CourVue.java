package views;
import entities.Cour;
import services.CourService;
import java.util.List;
import java.util.Scanner;
public class CourVue extends Vue<Cour> {
    private CourService courService;
    public CourVue(){}
    public CourVue(Scanner scanner, CourService courService){
        this.scanner = scanner;
        this.courService = courService;
    }
    @Override
    public Cour saisie() {
        return null;
    }
    @Override
    public void affiche() {
        for(Cour cours : courService.show()){
            System.out.println(cours);
        }
    }
}
