public class test7 {
    public static void main(String[] args) {
        //remove duplicate elements
        int arr[] = { 2,2,4,5 , 4 ,8, 6,8,10,10} ;
       for(int i = 0 ;i < arr.length ;i++)
       {
           for(int j = i + 1 ;j < arr.length ;j++)
           {
               if(arr[i] == arr[j])
               {
                   System.out.println(arr[j]);
               }
           }
       }

    }
}
