import java.util.Scanner;

public class sortarray {

    // Function to print the array
    static void Printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static  void reversearray(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        while (left < right)
        {
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left] = temp;
            left ++;
            right--;
        }
    }

    static  int [] squaresort(int arr[])
    {
        int n= arr.length;
        int left=0;
        int right=arr.length-1;
        //Create a new array
        int ans[]=new int[n];
        int k=0;
        while (left < right)
        {
            //Check the absolute values
            if (Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                ans[k++]=arr[left] * arr[left];
                left++;
            }
            else
            {
                ans[k++]=arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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
         int answer[]=squaresort(arr);
        reversearray(arr);
        System.out.println("After:");
        Printarray(answer);

    }
}
