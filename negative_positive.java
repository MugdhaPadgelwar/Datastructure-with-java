import java.util.Arrays;
public class negative_positive {
    public static void main(String[] args) {
        int[] arr={-2,4,5,6,7,-8,10,-3,15};
        negative(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    static void  negative(int[] arr)
    {
        
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }
    }
    
}
