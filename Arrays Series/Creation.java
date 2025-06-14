// Creation of an array 
import java.util.Scanner;
public class Creation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements to be entered in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //Taking input from the users
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Display the Array
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
        
    }
}