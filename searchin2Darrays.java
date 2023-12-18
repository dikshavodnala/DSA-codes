import java.util.Arrays;
public class searchin2Darrays
{
    public static void main(String args[])
    {
    int[][] arr={
        {23,4,56},
        {18,23,76,5},
        {88,54,34,6}
    };
    int target=54;
    int[] ans=search(arr,target); //format of return value{row,col}
    System.out.println(Arrays.toString(ans));
    }
   static int[] search(int[][] arr,int target)
   {
    for(int row=0;row<arr.length;row++)
    {
     for(int col=0;col<arr[row].length;col++)
     {
        if(arr[row][col]==target)
        return new int[]{row,col};
     }
    }
    return new int[]{-1,-1};
   }

}