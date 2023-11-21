public class AdjDiffAtMostK {
    public static void search(int arr[],int diff,int num){
        int i=0;
        while(i<arr.length){
            if(arr[i]==num){
                System.out.println("Element present at index: "+i);
                return;
            }
            i=i+Math.max(1,Math.abs(i-num)/diff);
        }
        System.out.println("Element not present in array");
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 7, 6 };
        search(arr, 2, 6);
    }
}
