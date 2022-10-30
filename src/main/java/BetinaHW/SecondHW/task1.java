package BetinaHW.SecondHW;

import java.util.Scanner;

public class task1 {
    //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args) {
        while(true) {
            try {
                System.out.println(returnNumber());
                break;
            } catch (RuntimeException e) {
                System.out.println("uncorrect type, input number");
            }
        }
    }
    public static float returnNumber () {
            Scanner sc = new Scanner(System.in);
            System.out.println("input float number");
            return sc.nextFloat();
    }

    }
