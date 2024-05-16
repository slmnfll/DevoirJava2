package services;
import entities.Cour;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CourService extends Service<Cour> {
    private final List<Cour> cours = new ArrayList<>();
    public CourService(){}
    public CourService(Scanner scanner){
        this.scanner = scanner;
    }
    @Override
    public void save(Cour object) {
        cours.add(object);
    }
    @Override
    public List<Cour> show() {
        return cours;
    }
}
