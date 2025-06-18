import java.util.Scanner;

public class sortoddeven
{
    // Function to print the array
    static void Printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static  void  sortevenodd(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            } else if (arr[left] % 2==0) {
                left++;
            } else if (arr[right] %2 == 1) {
                right--;
            }
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
        sortevenodd(arr);
        System.out.println("After:");
        Printarray(arr);
    }
}
