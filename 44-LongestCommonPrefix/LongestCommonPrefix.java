import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str){
        Arrays.sort(str);
        String firstString= str[0];
        String lastString=str[str.length-1];
        
        int index=0;
        //String newString="";
        while(index<firstString.length() && index<lastString.length()){
            if(firstString.charAt(index)==lastString.charAt(index)){
                //newString+=firstString.charAt(index);
                index++;
            }else{
                break;
            }
        }
        return firstString.substring(0, index);    
    } 
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        //String[] str = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }  
}
