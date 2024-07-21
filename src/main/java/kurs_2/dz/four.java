package kurs_2.dz;


import java.util.Scanner;

public class four {

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            int n= in.nextInt();
            System.out.println(countNumbers(n));
        }

        public static int countNumbers ( int n){

            int primeNumbers = gcd(2, 3, 5);

            int count = n;
            if (primeNumbers != 1) {
                count--;
            }
            return count;}

        private static int gcd ( int a, int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        private static int gcd ( int a, int b, int c){
            return gcd(gcd(a, b), c);
        }
    }
