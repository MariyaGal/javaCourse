package javase;

import java.text.NumberFormat;
import java.util. * ;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chislo {
    static String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name and number");
        String vvod = scanner.nextLine();
        String[] b = vvod.split(" ");
         name = b[0];
        String number = b[1];
        System.out.println("Имя " + name);
        System.out.println("Номер " + number);

        List<Integer> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(number);
        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group()));
        }
        list.forEach(System.out::println);
        int sum = 0;
        if (!list.isEmpty()) {
            sum = list.stream().mapToInt(Integer::intValue).sum();

        } 


//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }


        formatNumberAsName(sum);


    }
    public static void formatNumberAsName(int sum) {
        Locale locale = Locale.forLanguageTag("ru");
        NumberFormat formatter = NumberFormat.getInstance(locale);
        String summary = formatter.format(sum);
        System.out.printf("Здравствуй, %s , сумма чисел равна = %s%n", name, summary);
    }


}
