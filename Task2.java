public class Task2 {

    static void findSecondLargest(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        int second = 0;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) {
                if (!found || arr[i] > second) {
                    second = arr[i];
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest distinct number.");
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 25, 8, 30, 15, 30};
        int[] b = {5, 5, 5, 5, 5, 5};
        findSecondLargest(a);
        System.out.println();
        findSecondLargest(b);
    }
}