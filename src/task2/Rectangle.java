package task2;


public class Rectangle {

    public static void drawRectangle(int a, int b){
        for (int i = 0; i < a; i++)
            for (int j = 0; j <b; j++) {
                if ((j + 1) % b != 0)
                    System.out.print("+ ");
                else
                    System.out.println("+");
            }
    }

    public static void drawRectangle(int a){
        for (int i = 0; i < a; i++)
            for (int j = 0; j <a; j++) {
                if ((j + 1) % a != 0)
                    System.out.print("+ ");
                else
                    System.out.println("+");
            }
    }
    public static void main(String[] args) {
        drawRectangle(3, 5);
        System.out.println();
        drawRectangle(4);
    }
}
