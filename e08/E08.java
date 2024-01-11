import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (0 to quit):");
        int input = scanner.nextInt();
        while (input != 0) {
            if (input % 2 == 1) {
                System.out.println("Odd number");
            } else {
                System.out.println("Even number");
            }
            System.out.println("Enter a number (0 to quit):");
            input = scanner.nextInt();
        }
    }
}