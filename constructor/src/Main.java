import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("The sum is:" + sum);
    }
}
