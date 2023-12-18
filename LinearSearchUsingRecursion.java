public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr={ 13,56,78,90,90,24};
        System.out.println(search(arr,90,0));
        // System.out.println(findIndex(arr,26,0));
        findAllIndex(arr, 90,0);
        System.out.println(list);
    }
    static boolean search(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return false;
        }
        return arr[index] == target || search(arr, target,index+1);
    }
    //  static int findIndex(int[] arr, int target, int index)
    // {
    //     if(index == arr.length)
    //     {
    //         return -1;
    //     }
    //     if(arr[index] == target )
    //       return index;
    //     else{
    //        return findIndex(arr, target,index+1);
    //     }    
    // }

     static ArrayList<Integer> list = new ArrayList<>();
     static void findAllIndex(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return;
        }
        if(arr[index] == target ){
          list.add(index);
        }
          findAllIndex(arr, target,index+1);

    }   
}
