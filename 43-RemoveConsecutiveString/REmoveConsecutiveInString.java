public class REmoveConsecutiveInString {
    public static String removeConsecutiveCharacter(String S){
       String ans="";
       ans+=S.charAt(0);
       for(int i=1;i<S.length();i++)
       {
          if(S.charAt(i)!=S.charAt(i-1))
          ans+=S.charAt(i);
         
       }
       return ans;
   }
   public static void main(String[] args) {
        String S = "aabb";
        System.out.println(removeConsecutiveCharacter(S));
   }
}

