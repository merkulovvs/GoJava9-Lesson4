package task5;

import java.util.Scanner;

public class RecursiveCounter {

    public static void recursiveCounter(int a, int b){
        if(a<=b) {
            System.out.println(a);
            a++;
            recursiveCounter(a, b);
        }
    }

    public static void main(String[] args) {

        // count to number X

        int number;
        int firstNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number to count to: ");
        number = scanner.nextInt();
        recursiveCounter(firstNumber, number);
    }
}
