
public class Max{
    public static void main(String args[]){
    int[] arr={1,3,23,31,53};
    System.out.println(max(arr));
    }
    static int max(int[] arr)
    {
        int maxVal=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(a[i]>maxVal)
            {
                maxVal=arr[i];
            }
        }
    return maxVal;

    }
}