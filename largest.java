import java.util.Arrays;
import java.util.Scanner;

public class largest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int[] arr=new int[N];

        for(int i=0;i<N;i++)
        {
           arr[i]=sc.nextInt();
        }

         int[]output=new int[N];

         for(int i=0;i<N;i++)
         {

            for(int j=i+1;j<N-1;j++)
            {
                if(arr[j]>arr[i])
                {
                    output[i]=arr[j];
                    break;
                }
                
            }
            if(i==N-1)
            {
                output[i]=-1;
            }
         }
         System.out.println(Arrays.toString(output));

     


      



    }


}
