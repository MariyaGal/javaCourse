package basic;

import java.util. * ;

public class Massiv_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
//

        // Запрашиваем значения массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        // Создаем массив
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент %d: ", i + 1);
            array[i] = scanner.nextInt();
        }

//
        scanner2.close();
        System.out.println("число N: " +  N);
        System.out.println("массив: " + Arrays.toString(array));
        System.out.println(proverka(array, N));

    }
    public static boolean proverka(int[] array, int N) {
    for (int i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
            // Если сумма двух чисел равна N, возвращаем true
            if (array[i] + array[j] == N) {

                return true;
            }
        }
    }
    // Если пара не найдена, возвращаем false

        return false;
}
}
