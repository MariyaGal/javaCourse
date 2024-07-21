////import java.time.LocalTime;
////import java.util.Scanner;
////
////public class HomeWork {
////
////    public static void homeWork(){
////        Scanner vvod = new Scanner(System.in);
////        System.out.print("Введите строку: ");
////        String string= vvod.nextLine();
////
////        vvod.close();
////        int count=0;
////        for (char c: string.toCharArray()) {
////            if (c==' '){
////                count++;
////            }
////        }
////        System.out.println(count);
////
////    }
////}
////
////
////public class Application {
////    public static void main( String[] strings) {
////
////        Scanner vvod = new Scanner(System.in);
////        System.out.print("Введите числа: ");
////        int hour = vvod.nextInt(); //часы
////        int min= vvod.nextInt(); //мин
////        int sek= vvod.nextInt(); //сек
////        LocalTime time= LocalTime.of(hour,min,sek) ;
////        String username = String.valueOf(vvod.next());
////
////        if (time.getHour() >=5 && time.getHour()<12 )
////        {
////
////            System.out.println("Доброе утро, " + username);
////        }
////        if (time.getHour() >= 12 && time.getHour() < 16) {
////
////            System.out.println("Добрый день, " + username);
////        }
////        if (time.getHour() >= 16 && time.getHour() < 23) {
////
////            System.out.println("Добрый вечер, " + username);
////        }
////        if (time.getHour() >= 23 && time.getHour() < 5) {
////
////            System.out.println("Доброй ночи, "+ username);
////        }
////
////
////    }
////
////
////    public static void homeWork(){
////        Scanner vvod = new Scanner(System.in);
////        System.out.print("Введите строку: ");
////        String string= vvod.nextLine();
////
////        vvod.close();
////        int count=0;
////        for (char c: string.toCharArray()) {
////            if (c==' '){
////                count++;
////            }
////        }
////        System.out.println(count);
////
////    }
////}
//import java.io.Writer;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//