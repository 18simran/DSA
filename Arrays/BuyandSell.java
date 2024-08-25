package Arrays;

public class BuyandSell
{
    public static void main(String[] args)
    {

        int arr[] = {3,1,4,8,7,2,5};
        int max_profit = 0;
        int min = arr[0] ;
        for(int i =1 ;i <  arr.length ;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i] ;
            }
          else  if(arr[i] - min  > max_profit)
            {
               max_profit = arr[i] -min ;
            }
        }
        System.out.println(max_profit);
    }
}
