package services;
import entities.Cours;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CourService extends Service<Cours> {
    private final List<Cours> cours = new ArrayList<>();
    public CourService(){}
    public CourService(Scanner scanner){
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
