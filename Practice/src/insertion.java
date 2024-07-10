public class insertion
{
    public static void main(String[] args)
    {
        int[] arr = {7,8,3,1,2} ;
        for(int i = 1  ; i< arr.length  ;i++)
        {
            int temp = arr[i] ;
            int j = i -1 ;
            while(j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j] ;
                j-- ;
            }
            arr[j+1] = temp ;
        }
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}