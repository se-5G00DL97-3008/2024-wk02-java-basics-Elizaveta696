import java.util.Scanner;

class B01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting count:");
        int start = scanner.nextInt();
        while (start != 1) {
            System.out.println(String.format("%s bottles of beer on the wall, %s bottles of beer.\n" + //
                    "Take one down and pass it around, %s bottles of beer on the wall.", start, start, start - 1));
            start--;
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer\n" + //
                "Take one down and pass it around, no more bottles of beer on the wall.\n" + //
                "No more bottles of beer on the wall, no more bottles of beer.\n" + //
                "Go to the store and buy some more, <99> bottles of beer on the wall.");
    }
}