import java.util.*;
class TankerWaterSpillage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int H = sc.nextInt();
        int arr1[] = new int[L];
        int arr2[] = new int[L];
        
        for(int i=0; i<L; i++){
            arr1[i] = sc.nextInt();
        
        }
        
        for(int i=0; i<L; i++){
            arr2[i] = sc.nextInt();
        
        }
        
        int sum=0;
        for(int i = 0; i<L; i++){
            sum = arr1[i] + arr2[i];
            
            if(sum == H){
                System.out.println("No");
                break;
            }
        }
        
        if(sum < H)
           System.out.println("Yes");
        
    }
}