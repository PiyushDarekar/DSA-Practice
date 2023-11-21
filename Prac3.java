import java.util.ArrayList;
import java.util.List;

public class Prac3 {
    public static List<Integer> spiralOrder(int[][] matrix){
         List<Integer> ans = new ArrayList<>();

         int rowBegin=0;
         int rowEnd=matrix.length-1;
         int colBegin=0;
         int colEnd=matrix[0].length-1;

         while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;i++){
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            for(int i=colEnd;i>=colBegin;i--){
                ans.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            for(int i=rowEnd;i>=rowBegin;i--){
                ans.add(matrix[i][colBegin]);
                colBegin++;
            }
         }
         return ans;
    }
    public static void main(String[] args) {
         int matrix[][] ={{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        List<Integer> result=spiralOrder(matrix);
        System.out.println(result);
    }
}
