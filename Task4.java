public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 4, 3, 7};

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Duplicates: ");
        boolean anyDuplicate = false;
        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyChecked = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }
            boolean hasDuplicate = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) {
                System.out.print(numbers[i] + " ");
                anyDuplicate = true;
            }
        }
        if (!anyDuplicate) {
            System.out.print("none");
        }
        System.out.println();
    }
}
