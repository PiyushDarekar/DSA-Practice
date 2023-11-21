import java.util.Arrays;

public class SetZeros{
    public static void setZeros(int[][] matrix){
        int rowArray[] = new int[matrix.length];
        int colArray[] = new int[matrix[0].length];

        Arrays.fill(rowArray,1);
        Arrays.fill(colArray,1);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowArray[i]=0;
                    colArray[j]=0;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rowArray[i]==0 || colArray[j]==0){
                    matrix[i][j]=0;
                }
            }
        }

         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        setZeros(matrix);
    }
}
                                    //Another Way

// public class SetZeros{

// public static void setZeros(int[][] matrix){

// 		int m=matrix.length, n=matrix[0].length;
//         boolean isRow0=false, isCol0=false;
        
//         for(int j=0;j<n;j++){
//             if(matrix[0][j]==0)
//                 isRow0=true;
//         }
        
//         for(int i=0;i<m;i++){
//             if(matrix[i][0]==0)
//                 isCol0=true;
//         }
        
//         for(int i=1;i<m;i++){
//             for(int j=1;j<n;j++){
//                 if(matrix[i][j]==0){
//                     matrix[i][0]=0;
//                     matrix[0][j]=0;
//                 }
//             }
//         }
        
//         for(int i=1;i<m;i++){
//             for(int j=1;j<n;j++){
//                 if(matrix[0][j]==0 || matrix[i][0]==0)
//                     matrix[i][j]=0;
//             }
//         }
        
//         if(isRow0){
//             for(int j=0;j<n;j++)
//                 matrix[0][j]=0;
//         }
        
//         if(isCol0){
//             for(int i=0;i<m;i++)
//                 matrix[i][0]=0;
//         }
//          for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
    
//  public static void main(String[] args) {
//         int matrix[][]={
//             {0,1,2,0},
//             {3,4,5,2},
//             {1,3,1,5}
//         };
//         setZeros(matrix);
//     }
// }