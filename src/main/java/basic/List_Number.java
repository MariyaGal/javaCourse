package basic;

import java.util. * ;

public class List_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
//        scanner.close();

        int[] digits = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
        System.out.println(Arrays.toString(digits));

        List<int[]> massiv = new ArrayList<>();
        System.out.print("Введите количество листов в листе: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент %d: ", i + 1);
            array[i] = scanner.nextInt();


            massiv.add(array);
        }
        scanner.close();

        for (int i = 0; i < massiv.size(); i++) {
            for (int j = 0; j < massiv.get(i).length; j++) {
//                System.out.print(massiv.get(i)[j] + " ");
            }
        }
//        System.out.println("лист листов имеет вид: " + Arrays.toString(array));

        if (massiv.size() != digits.length) {
            System.out.println("FALSE");
            return;
        }
        for (int i = 0; i < digits.length; i++) {
            int[] subList = massiv.get(i);

            // Проверяем, что количество элементов в подсписках соответствует цифре
            if (subList.length != digits[i]) {
                System.out.println("FALSE");
                return;
            }
        }

        // Если все проверки пройдены успешно, возвращаем true
            System.out.println("TRUE");

    }
}
