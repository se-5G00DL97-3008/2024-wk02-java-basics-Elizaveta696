import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        System.out.println("Give a test score (-1 to quit):");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        double sum = 0;
        int count = 0;
        while (score != -1) {
            count++;
            sum += score;
            System.out.println(String.format("Average: %s", sum / count));
            System.out.println("Give a test score (-1 to quit):");
            score = scanner.nextInt();
        }
    }
}