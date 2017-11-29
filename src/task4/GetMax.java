package task4;

public class GetMax {

    public static int getMax(int a, int b){
        int max;

        if(a > b)
            max = a;
        else
            max = b;

        return max;
    }

    public static float getMax(float a, float b){
        float max;

        if(a > b)
            max = a;
        else
            max = b;

        return max;
    }

    public static void main(String[] args) {
       int maxIntNumber = getMax(2, 9);
        System.out.println("Maximum integer number is: " + maxIntNumber);

       float maxFloatNumber = getMax(6.88f, 3.45f);
        System.out.println("Maximum float number is: " + maxFloatNumber);

    }
}
