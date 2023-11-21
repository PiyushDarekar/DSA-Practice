import java.util.Arrays;
import java.util.Collections;

public class PermuteTwoArrays{
    public static boolean isPossible(Integer a[], int b[], int k){
        Arrays.sort(a,Collections.reverseOrder());
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
            if(a[i]+b[i]<k)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Integer a[]={1,2,3};
        int b[]={7,8,9};
        int k=10;

        if(isPossible(a, b, k))
            System.out.println("Yes");
        else
            System.out.println("No");    
    }
}