import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
      HashSet<Integer> arr=new HashSet<>();
      for(int i=0;i<nums.length;i++){
          if(arr.contains(nums[i]))
            return true;

          arr.add(nums[i]);  
      }
      return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 6};
        System.out.println(containsDuplicate(arr));
    }
}
