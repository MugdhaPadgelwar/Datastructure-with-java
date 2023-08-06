import java.util.Scanner;

public class acct {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        int m=sc.nextInt();
        int n=sc.nextInt();
       int divisible=0;
       int notDivisible=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                divisible+=i;
            }
            else{
                notDivisible+=i;
            }
        }
        int sub=notDivisible-divisible;
        System.out.println(sub);
    }
    
}
