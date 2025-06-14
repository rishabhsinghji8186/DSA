public class ReverseAnarray {


    static  void swaparr(int arr[])
    {
        int n= arr.length;
        int left=0;
        int right=n-1;
        while (left < right)
        {
            //swap the value
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    static  void Display(int arr[])
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array before swapping");
        Display(arr);
        swaparr(arr);
        System.out.println("Array after swapping");
        Display(arr);
    }
}
