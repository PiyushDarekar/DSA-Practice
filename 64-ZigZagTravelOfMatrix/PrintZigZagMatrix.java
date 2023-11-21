import java.util.ArrayList;

public class PrintZigZagMatrix {
    public static void diagonalOrder(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>(row+col-1);

        for(int i=0;i<row+col-1;i++){
            ans.add(new ArrayList<Integer>());
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans.get(i+j).add(arr[i][j]);
            }
        }
        for(int i=0;i<ans.size();i++){
            for(int j=ans.get(i).size()-1;j>=0;j--){
                 System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }   
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        diagonalOrder(arr);
    }
}
