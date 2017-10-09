import java.util.ArrayList;

public class Assessment {
    private ArrayList<Integer> averageOfAll;

    public static void main(String[] args) {
        System.out.println("square " + square(5));
        System.out.println("sum int " + sum(3,4));
        System.out.println("sum double " + sum(7.5,8.4));
//        int[] numbers = new int[]{50,60,40,10};
//        System.out.println(numbers);




    }

    public static double[] numbers =
            {50,60,40,10};
    public static int square(int number){
        return number * number;
    }
    public static double sum(double number1, double number2){
        return number1 + number2;
    }
    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    public static void Assessment(){

    }
//    public double average(double[] numbers){
//        int sum = 0;
//    }
//    public double average(){
//        double total = 0;
//        for (Integer ave : averageOfAll){
//            total += ave;
//        }
//        total /= averageOfAll.size();
//        return total;
//    }

}
