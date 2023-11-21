public class IsAnagram {
    public static boolean isAnagram(String s,String t){
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i : arr){
            if(i!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
         System.out.println(isAnagram(s, t));
     }
}
