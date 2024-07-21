package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_N {
    public static void main(String[] strings) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = vvod.nextInt();
        vvod.close();
//        ArrayList<Object> array = new ArrayList<>();
        if (N == 1) {
            System.out.println("число 1 не является простым");
        }
        for (int j = 1; j <= N; j++) {
            boolean priznak = false;

            for (int i = 2; i * i <= j; i++) {
                priznak = (j % i == 0);
                if (priznak) {
                    break;
                }
                if (!priznak) {
System.out.print(j+ " ");
                }


            }
        }
    }
}