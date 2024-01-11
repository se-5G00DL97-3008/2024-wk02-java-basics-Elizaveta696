import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int num = scanner.nextInt();
        System.out.println("Until which multiplier should the table show?");
        int limit = scanner.nextInt();
        for (int i = 0; i <= limit; i++) {
            System.out.println(String.format("%s x %s = %s", i, num, num * i));
        }
    }
}
