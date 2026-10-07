import java.util.Scanner;

public class ProgrammingAssignment1 {

    public static void makeNumbers(int n, int number, int lastDigit) {
        if (String.valueOf(number).length() == n) {
            System.out.println(number);
            return;
        }

        for (int i = lastDigit + 1; i <= 9; i++) {
            makeNumbers(n, number * 10 + i, i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 9) {
            return;
        }

        for (int i = 1; i <= 9; i++) {
            makeNumbers(n, i, i);
        }
    }
}
