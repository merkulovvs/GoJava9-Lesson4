package task6;

import java.util.Scanner;

public class RecursiveRectangle {

    static void recursiveRectangle(int a, int b){

        if(b>0){
            a*=b;
            b=-b;
        }

        System.out.print("+");
        a--;
        if(a%b==0)
            System.out.println();
        if(a!=0)
            recursiveRectangle(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the rectangle height: ");
        int height = scanner.nextInt();
        System.out.print("Please enter the rectangle width: ");
        int width = scanner.nextInt();
        System.out.println(height + " " + width);

        recursiveRectangle(height, width);


    }
}
