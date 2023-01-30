public class DigitSum {
    public static void main(String[] args)
    {
        int ans=dsum(1324);
        System.out.println(ans);
    }

    public static int dsum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)+dsum(n/10);
    }
    
}
