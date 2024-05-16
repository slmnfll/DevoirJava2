package views;
import core.IVue;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public abstract class Vue<toDefine> implements IVue<toDefine> {
    protected Scanner scanner;
    public String inputString(String format){
        System.out.println(format);
        return scanner.nextLine();
    }
    public static LocalDate formatDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }
    public static LocalTime formatTime(String time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(time, formatter);
    }
    public int inputID(){
        System.out.println("Entrer l'ID du professeur devant reçevoir le cours:");
        return scanner.nextInt();
    }
}
