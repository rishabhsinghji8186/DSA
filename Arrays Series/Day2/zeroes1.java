import java.util.Scanner;

public class zeroes1
{
    //Count Zeoro
    static void countzero(int arr[])
    {
        int count=0;
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]==0)
            {
                count++;
            }
        }
        //now put zero from to arr.length -count
        for (int i=0;i< arr.length;i++)
        {
            if (i<count)
            {
                arr[i]=0;
            }
            else
                arr[i]=1;
        }
    }
    //now put zero from to arr.length -count

    //Code for printing the array
    static void  Printarray(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        //take input from user
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Before ");
        Printarray(arr);
        countzero(arr);
        System.out.println("After");
        Printarray(arr);
    }
}
