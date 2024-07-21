package new_kurs_java;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int row = scanner.nextInt();

        int[][] array = new int[row][line];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                array[i][j] = scanner.nextInt();
                System.out.println(array[i][j]);
            }

        }

        for  (int i  =  0; i  < row; i++)  {int sum  = 0;
            for (int j = 0; j < line; j++) {
              sum+= array[i][j];
            }
            System.out.println("Row " + (i + 1) + ": Sum = " + sum);
        }
        for  (int j  =  0; j  < line; j++)  {
            int sum  = 0;
            for (int i =  0; i  < row; i++)  {
                sum+= array[i][j];
            }
            System.out.println("line " + (j + 1) + ": Sum = " + sum);
        }
        for  (int i  =  0; i  < row; i++)  {
            for (int j = 0; j < line; j++) {
                if (array[i][j]%2==0) {
                    array[i][j]=0;
                    System.out.println(array[i][j]);
            }else{
                    array[i][j]=1;

                }
            }

        }
        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            int average = sum / array.length;
            System.out.println(STR."целое среднее арифметическое для строки \{j + 1} равно \{average}");
            }
    }


}
