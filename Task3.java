import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();

        if (index < 0 || index >= numbers.length) {
            System.out.println("Invalid index.");
        } else {
            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            System.out.print("After removing: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }
}
