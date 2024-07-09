public class test8 {
    public static void main(String[] args) {
        //liner search
       int arr[] =  {1,2,3,4,5,6} ;
       int key = 4 ;
       for(int i = 0; i < arr.length ;i++)
       {
           if(arr[i] ==key)
           {
               System.out.println(i);
               return;
           }

       }
    }
}
