import java.util.Arrays;

public class PrintAllDuplicatesInString {
    public static void printDuplicates(String str){

        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        String sortedStr=new String(chars);

        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && sortedStr.charAt(i)==sortedStr.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                System.out.println(sortedStr.charAt(i)+", Count = "+count);
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "test string";
        printDuplicates(str);
    }
}
