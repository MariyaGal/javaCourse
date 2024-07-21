package new_kurs_java;

public class three {
    public static void main(String[] args) {
        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

        printEvenNumbers(array);

        printTwoDigitNumbers(array);

        int largestNumber = findLargestNumber(array);
        System.out.println("Наибольшее число: " + largestNumber);

        int sum = calculateSum(array);
        System.out.println("Сумма элементов массива: " + sum); 
    }

    private static void printEvenNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(STR."являются чётными числами \{num}");
            }
        }
    }
    private static void printTwoDigitNumbers(int[] array) {
        for (int num : array) {
            if (num >= 10 && num <= 99) {
                System.out.print("двузначные числа " + num);
            }
        }
    }
    private static int findLargestNumber(int[] array) {
        int largest = array[0];
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
