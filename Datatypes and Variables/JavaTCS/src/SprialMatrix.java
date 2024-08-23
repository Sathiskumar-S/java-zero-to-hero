public class SprialMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        int rowStart = 0, rowEnd = matrix.length;
        int colStart = 0, colEnd = matrix[0].length;

        while (rowStart < rowEnd && colStart < colEnd){
            // top -> left to right
            for(int i=colStart;i<colEnd;i++){
                System.out.print(matrix[rowStart][i]+" ");
            }

            rowStart+= 1;

            for(int i=rowStart;i<rowEnd;i++){
                System.out.print(matrix[i][colEnd-1]+" ");
            }
            colEnd -= 1;

            for(int i=colEnd-1;i>=colStart;i--){
                System.out.print(matrix[rowEnd-1][i]+" ");
            }
            rowEnd -= 1;

            for (int i = rowEnd-1; i >= rowStart ; i--) {
                System.out.print(matrix[i][colStart]+" ");
            }
            colStart+=1;

        }
    }
}
