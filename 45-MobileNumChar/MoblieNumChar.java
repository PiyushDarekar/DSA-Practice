import java.util.InputMismatchException;

public class MoblieNumChar {
    public static String printString(String[] arr,String input){
        String output="";

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                output+="0";
            }else{
                 int position=input.charAt(i)-'A';
                 output+=arr[position];
            }
        }
        return output;
    }
    public static void main(String[] args) {

        String[] arr={
                "2", "22", "222", "3", "33", "333",
				"4", "44", "444", "5", "55", "555",
				"6", "66", "666", "7", "77", "777",
				"7777", "8", "88", "888", "9", "99",
				"999", "9999" };
        String input="GEEKS FOR GEEKS";        
        System.out.println(printString(arr, input));        
    }
}
