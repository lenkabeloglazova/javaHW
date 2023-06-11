package HW;

import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество чисел в последовательности: ");
            int n = scanner.nextInt();
            int sum = 0;
            System.out.println("Введите последовательность чисел:");
            for (int i = 0; i < n; i++) {
                int number = scanner.nextInt();
                if (isPrime(number)) {
                    sum += number;
                }
            }
            System.out.println("Сумма простых чисел: " + sum);
        }
    public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }   
    }
    