package BetinaHW.SecondHW;

import java.util.Scanner;

public class task4 {
    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input something");
        String str = sc.nextLine();
        if(str.equals(""))
        throw new RuntimeException("String cant be empty");
        System.out.println();


}}
