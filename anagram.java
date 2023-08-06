import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
       s1= s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length())
        {
            System.out.println("NO");
        }
        else{
           char[] arrayS1=s1.toCharArray();
           char[] arrayS2=s2.toCharArray();
           Arrays.sort(arrayS1);
           Arrays.sort(arrayS2);
           boolean res=Arrays.equals(arrayS1, arrayS2);
           if(res==true)
           {
            System.out.println("YES");
           }
           else{
        System.out.println("NO");
           }


           
        }
    }
    
}
