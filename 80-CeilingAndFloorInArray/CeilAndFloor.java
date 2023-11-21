
//My Solution

public class CeilAndFloor {
    public static void ceilAndFloor(int[] arr,int num){
        if(num<arr[0])
            System.out.println("No floor and ceiling is: "+arr[0]);
        else if(num>arr[arr.length-1])
            System.out.println("Floor is: "+arr[arr.length-1]+" and no ceiling");
        else if(num==arr[0])
            System.out.println("Floor is: "+arr[0]+" and ceiling is: "+arr[0]);
        else if(num==arr[arr.length-1])
            System.out.println("Floor is: "+arr[arr.length-1]+" and ceiling is: "+arr[arr.length-1]);   
        else{
            for(int i=1;i<arr.length-1;i++){
            if(arr[i]==num)
                System.out.println("Floor is: "+arr[i]+" and ceiling is: "+arr[i]);
            else if(num>arr[i] && num<arr[i+1]){
                System.out.println("Floor is: "+arr[i]+" and ceiling is: "+arr[i+1]);
            }    
            }    
        }    
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 10, 10, 12, 19};
        int num=5;
        ceilAndFloor(arr, num);
    }
}
