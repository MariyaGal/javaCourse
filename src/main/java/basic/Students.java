package basic;

import java.util.*;

public class Students {


    private final String fio;
    private final int sr_ball;


    public Students(String fio, int sr_ball) {
        this.fio = fio;
        this.sr_ball = sr_ball;

    }

    public static void main(String[] strings) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число студентов: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Пропускаем перевод строки после числа
        List<Students> students = new ArrayList<>();


//        int[] array = new int[size];
            String fio;
            int sr_ball;
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);

            for (int i = 0; i < size; i++) {
                fio= scanner2.nextLine();
                sr_ball = scanner3.nextInt();
                students.add(new Students(fio, sr_ball));
            }
//        Students maxNumber = Collections.max(students, Comparator.comparingInt(Students::getSrBall));
        Optional<Students> maxNumber = students.stream()
                .max(Comparator.comparingInt(Students::getSrBall));
        Students studentWithMaxSrBall = maxNumber.get();
        System.out.println("Максимальный балл: " + studentWithMaxSrBall.getSrBall());
        System.out.println("ФИО студента: " + studentWithMaxSrBall.fio);



            scanner.close();
            scanner2.close();
            scanner3.close();

    }

    private int getSrBall() {
        return  sr_ball;
    }
}

