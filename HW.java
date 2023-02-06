// Напишите программу, которая принимает на вход число N и находит факториал этого числа
import java.util.Scanner;
public class HW {
    static long factCalculator(int n){
        long store_fact = 1;
        int i =1;
        while(i <= n){
            store_fact = store_fact*i;
            i++;
        }
        return store_fact;
    }
    public static void main(String args[]) {
      int number;
      Scanner scan = new Scanner(System.in);
      System.out.println("Введите число: ");
      number = scan.nextInt();
      System.out.println(factCalculator(number));
    }
}