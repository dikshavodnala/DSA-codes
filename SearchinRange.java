public class SearchinRange
{ 
    public static void main(String args[])
    {
     int[] arr={18,12,3,4,-15,6};
     int target=23;
     System.out.println(linSearch(arr,target,1,5));
    }
    static int linSearch(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        return -1;

        for(int i=start;i<=end;i++)
        {
            //check for element at target index if it is=target
            int element=arr[i];
            if(element==target)
            {
                return i;
            }
        }
     return -1;
    }

}