package oop.home.home1;

import java.util.Random;
import java.util.Scanner;

public class Матрица {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        Random rand = new Random();
        double[][] array = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextDouble();
            }
        }
        print(array);

    }


    double sum = 0;
    public void summ(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];

            }
        }
        System.out.println(sum);


    }

    public static void print(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(STR."\{array[i][j]} ");
            }
            System.out.println();



        }
    }
    double pow = 0;
    int n=2;
        public void powN (double[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    pow = array[i][j]*n;
                }
            }
            System.out.println(pow);
        }
    double powpow = 0;
        public void pow2 (double[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    powpow = array[i][j]*array[i][j];
                }
            }
            System.out.println(powpow);
        }

    }


