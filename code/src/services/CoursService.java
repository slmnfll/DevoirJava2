package services;
import entities.Cours;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CoursService extends Service<Cours> {
    private final List<Cours> cours = new ArrayList<>();
    public CoursService(){}
    public CoursService(Scanner scanner){
        this.scanner = scanner;
    }
    @Override
    public void save(Cours object) {
        cours.add(object);
    }
    @Override
    public List<Cours> show() {
        return cours;
    }
}
