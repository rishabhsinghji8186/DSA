public class targetsum {

    static int noofpairs(int arr[],int target)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i] + arr[j] == target) {
                    count++;
                    
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,1,3,4};
   //Display the Array
       int ans=noofpairs(arr, 7);
       System.out.println(ans);
    }
    
}
