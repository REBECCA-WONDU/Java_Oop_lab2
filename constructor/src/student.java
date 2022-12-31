import java.util.Scanner;

public class student {
    static int i;

    public static void main(String[] args) {
        String[] Year;
        Year = new String[5];
        Year[0] = "JANUARY";
        Year[1] = "FEBRUARY";
        Year[2] = "MARCH";
        Year[3] = "APRIL";
        Year[4] = "JUNE";
        for (int i = 0; i < 5; i++) {
            System.out.println(Year[i]);
//
            class Main {
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

        }
    }
}