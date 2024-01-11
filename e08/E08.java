import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number (0 to quit):");
        int input = scanner.nextInt();
        while (input != 0) {
            if (input % 2 == 1) {
                System.out.println("Number is odd");
            } else {
                System.out.println("Number is even");
            }
            System.out.println("Give a number (0 to quit):");
            input = scanner.nextInt();
        }
    }
}
