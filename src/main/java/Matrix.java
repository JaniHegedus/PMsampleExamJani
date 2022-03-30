import java.util.ArrayList;

public class Matrix
{
    public Matrix() {
    }
    public static ArrayList<Integer> indexesOfNullColumns(int[][] matrix)
    {
        ArrayList<Integer> matrixnull = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++)
        {
            if(matrix[0][i]==0)
            {
                matrixnull.add(i);
            }
        }
        return matrixnull;
    }
    public static int[] indexOfMaximum(int[][] matrix)
    {
        int[] maxelem = new int[2];
        ArrayList<Integer> all = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                all.add(anInt);
            }
        }


        int maximum = all.get(0);
        for (int i = 1; i < all.size(); i++) {
            if (maximum < all.get(i))
                maximum = all.get(i);
        }
        outerloop:
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(maximum==matrix[i][j])
                {
                    maxelem[0]=i;
                    maxelem[1]=j;
                    //i= matrix.length-1;
                    //j=matrix[i].length-1;
                    break outerloop;
                }
            }
        }
        return maxelem;
    }
}