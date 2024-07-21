package basic;

import java.util.Scanner;

public class Stroka_Probel {
public static void main(String[] strings) {
    Scanner vvod = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string= vvod.nextLine();

        vvod.close();
        int count=0;
        for (char c: string.toCharArray()) {
            if (c==' '){
                count++;
            }
        }
        System.out.println(count);
//
}
}