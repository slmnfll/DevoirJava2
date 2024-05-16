package entities;
import java.time.LocalDate;
import java.time.LocalTime;
public class Cours {
    private static int counter;
    private int id;
    private LocalDate date;
    private LocalTime heureDB;
    private LocalTime heureFN;
    public Cours(){counter++;}
    public Cours(LocalDate date, LocalTime heureDB, LocalTime heureFN){
        this.id = ++counter;
        this.date = date;
        this.heureDB = heureDB;
        this.heureFN = heureFN;
    }
    public int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
    public LocalTime getHeureDB() {
        return heureDB;
    }
    public void setHeureDB(LocalTime heureDB) {
        this.heureDB = heureDB;
    }
    public LocalTime getHeureFN() {
        return heureFN;
    }
    public void setHeureFN(LocalTime heureFN) {
        this.heureFN = heureFN;
    }
    @Override
    public String toString() {
        return "Cours{" + "id=" + id + ", date=" + date + ", heureDB=" + heureDB + ", heureFN=" + heureFN + '}';
    }
}
