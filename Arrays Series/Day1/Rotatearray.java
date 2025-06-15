import java.util.Scanner;

public class Rotatearray
{
    //code for reverse an array
    static void reversearray(int arr[],int left,int right)
{
    while (left < right)
    {
        int temp= arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        left++;
        right--;

    }

}
    //Code for rotate an array
    static  void rotate(int arr[],int k)
    {
        int n=arr.length;
        k=k%n;

        reversearray(arr,n-k,n-1);
        reversearray(arr,0,n-k-1);
        reversearray(arr,0,n-1);

    }
    //Code for display the array 
    static  void Display(int arr[])
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the no of time you want array to be rotated");
        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        rotate(arr,k);
        Display(arr);


    }
}
