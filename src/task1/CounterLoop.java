package task1;


import java.util.Scanner;

public class CounterLoop {

    public static void counterLoop(int a){
        for (int i = 1; i <=a; i ++)
            System.out.println(i);
    }

    public static void main(String[] args) {

        // count to number X

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number to count to: ");
        number = scanner.nextInt();
        counterLoop(number);
    }
}
