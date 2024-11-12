//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Введите номер дня недели");
        int N = in.nextInt();
        switch (N){
            case 1: System.out.println("Пон");
                break;
            case 2: System.out.println("Втор");
                break;
            case 3: System.out.println("Сред");
                break;
            case 4: System.out.println("Чет");
                break;
            case 5: System.out.println("Пят");
                break;
            case 6: System.out.println("Суб");
                break;
            case 7: System.out.println("Воскр");
                break;
            default: System.out.println("ОШИБКА");
        }

    }
}