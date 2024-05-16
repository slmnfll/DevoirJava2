package views;
import core.IVue;
import java.util.Scanner;
public abstract class Vue<toDefine> implements IVue<toDefine> {
    protected Scanner scanner;
    public String inputString(String format){
        System.out.println(format);
        return scanner.nextLine();
    }
}
