import java.util.Arrays;

class Pair{
    int min;
    int max;
}
public class MinMaxInArray {
    public static Pair findMinMax(int[] arr){
        Pair pair=new Pair();
        Arrays.sort(arr);
        pair.min=arr[0];
        pair.max=arr[arr.length-1];
        return pair;
    } 
    public static void main(String[] args) {
        int[] arr={8,5,9,2,4,1,};
        Pair pair=findMinMax(arr);
        System.out.println(pair.min+" "+pair.max);
    }
}
