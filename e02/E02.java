import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int input_1 = scanner.nextInt();
        System.out.println("Give a number: ");
        int input_2 = scanner.nextInt();
        System.out.println(String.format("%s + %s = %s", input_1, input_2, input_1 + input_2));
        System.out.println(String.format("%s * %s = %s", input_1, input_2, input_1 * input_2));
        System.out.println(String.format("%s - %s = %s", input_1, input_2, input_1 - input_2));
        System.out.println(String.format("%s / %s = %s", input_1, input_2, input_1 / input_2));
    }
}
