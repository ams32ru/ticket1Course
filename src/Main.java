import java.util.Scanner;

public class Main {
    // первый метод для возведения числа в квадрат
    public static int squaring(int nums) {
        int result = nums * nums;
        return result;
    }
    // второй метод для возведения в квадрат
    public static void squaring1() {
        Scanner ska = new Scanner(System.in);
        System.out.println("Введите целое число что бы возвести его в квадрат");
        int nums = ska.nextInt();
        int result1 = nums * nums;
        System.out.println(result1);
    }

    public static void main(String[] args) {
        System.out.println("squaring(5) = " + squaring(5));
        squaring1();

    }
}