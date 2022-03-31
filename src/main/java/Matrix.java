import java.util.ArrayList;

public class Matrix
{
    public Matrix()
    {
        //void
    }
    public static ArrayList<Integer> indexesOfNullColumns(int [][]matrix)
    {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i=0;i<matrix[0].length;i++)
        {
            for(int j =0;j < matrix.length;j++)
            {
                if(matrix[j][i] !=0 )
                {
                    break;
                }
                if(j == matrix.length-1)
                {
                    index.add(i);
                }
            }
        }
        return index;
    }
    public static int[] indexOfMaximum(int[][] matrix)
    {
        int[] maxelem = new int[2];
        ArrayList<Integer> all = new ArrayList<>();
        for (int[] ints : matrix)
        {
            for (int anInt : ints)
            {
                all.add(anInt);
            }
        }
        int maximum = all.get(0);
        for (int i = 1; i < all.size(); i++)
        {
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
                    break outerloop;
                }
            }
        }
        return maxelem;
    }
}