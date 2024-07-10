public class Quick
{
    public static int partition(int[] arr, int lb, int ub)
    {
        int pivot = arr[ub] ;
        int i = lb- 1 ;
        for(int j = lb ; j < ub ;j++)
        {
            if(arr[j] < pivot)
            {
                i++ ;
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
            }
        }
        i++;
        int temp = arr[i] ;
        arr[i] =  pivot ;
        arr[ub] = temp ;
        return i ;
    }
    public static void quicksort(int[] arr, int lb, int ub)
    {
        if(lb < ub)
        {
            int pidex = partition(arr,lb,ub) ;
            quicksort(arr,lb,pidex - 1) ;
            quicksort(arr,pidex + 1,ub);
        }

    }
    //divide and conquer method
    public static void main(String[] args)
    {
        int[] arr = {5,3,8,2,7,6,1,4,9};

        quicksort(arr, 0 , arr.length- 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}