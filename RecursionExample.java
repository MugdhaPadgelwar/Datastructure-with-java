public class RecursionExample {
    public static void main(String[] args)
    {
        //fun(5);
        fun2(7);
    }

    public static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    public static void fun2(int n)
    {
        if(n==0)
        {
            return;
        }
        
        fun2(n-1);
        System.out.println(n);
    }
    
}
