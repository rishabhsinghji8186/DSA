import java.util.Scanner;

public class zeroes2 {

    // Function to move all 0s to the left and 1s to the right
    static void zeroes(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                // Swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            }
        }
    }

    // Function to print the array
    static void Printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Take input from user
        System.out.println("Enter " + n + " elements (only 0s and 1s):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before:");
        Printarray(arr);
        System.out.println("After:");
        zeroes(arr);
        Printarray(arr);
    }
}
