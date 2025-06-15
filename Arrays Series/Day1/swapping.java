public class swapping {
    static  void  swap(int a,int b)
    {
        System.out.println("Numbers Before Swapping :---");
        System.out.println(" a:" + a);
        System.out.println(" b:" + b);

        int temp = a;  // store a's value
        a = b;         // copy b into a
        b = temp;      // copy original a (temp) into b

        System.out.println("Numbers After Swapping :---");
        System.out.println(" a:" + a);
        System.out.println(" b:" + b);

    }
    static  void diffswap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a );
        System.out.println(b);
    }
    public static void main(String[] args) {
        diffswap(12,11);

    }
}
