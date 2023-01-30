public class fibo {
    public static void main(String[] args)
    {
        System.out.println(fiboo(7));

    }
    static int fiboo(int n)
    {
        if(n<2)
        {
            return n;
        }

       return fiboo(n-1)+fiboo(n-2);
    }
    
}
